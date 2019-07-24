package domain.services;

import domain.Endpoints;
import domain.model.ParsedData;
import domain.model.WeatherMap;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

@Service
@Getter
public class WeatherParserService {

    private ParsedData parsedData;
    private LocalDateTime inputTime;

    private void getWeatherFromApi() {
        WebClient.create(Endpoints.BASE + Endpoints.APIKEY)
                .get()
                .retrieve()
                .bodyToMono(WeatherMap.class) //check
                .doOnNext(response -> {
                            parsedData = new ParsedData();
                            parsedData.setCountryCode(response.getCod());
                            parsedData.setCityName(response.getName());
                            parsedData.setAverageTemperature(Double.valueOf((response.getMain().getTemp_max() + response.getMain().getTemp_min()) / 2).toString());
                            parsedData.setAveragePressure(Double.valueOf(response.getMain().getPressure()).toString());
                            parsedData.setAverageHumidity(Double.valueOf(response.getMain().getHumidity()).toString());
                        }).subscribe();
    }

    public Mono<ParsedData> getParsedData() { //todo load from cache
            getWeatherFromApi();
            return Mono.fromCallable(() -> parsedData);

    }

    private long checkDate() {  //todo tests
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(inputTime, now);
        System.out.println(duration.toMinutes());
        return Math.abs(duration.toMinutes());
    }
}
