package domain;



import domain.model.Post;
import domain.model.WeatherMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.net.MalformedURLException;

import java.net.URL;
//import domain.Endpoints;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws MalformedURLException {
        System.getProperties().put("server.port", 1000);
        SpringApplication.run(Application.class, args);
        System.out.println("Aplikacja się skompilowała");

    }

    public int add (int x, int y) {
        return x*y;
    }

//    private static void getWeatherFromApi() {
//        WebClient.create(Endpoints.BASE + Endpoints.APIKEY)
//                .get()
//                .retrieve()
//                .bodyToFlux(WeatherMap.class)
//                .doOnNext(System.out::println)
//                .subscribe();
////    }
}
