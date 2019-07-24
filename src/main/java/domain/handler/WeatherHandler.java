package domain.handler;

import domain.services.WeatherParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromObject;

@Component
public class WeatherHandler {

    @Autowired
    private WeatherParserService weatherParserService;

    public Mono<ServerResponse> getParsedData(ServerRequest serverRequest) {
        return Mono.just(serverRequest)
                .flatMap(request -> weatherParserService.getParsedData())
                .flatMap(this::okJsonResponse);
    }

    private Mono<ServerResponse> okJsonResponse(Object response) {
        return ServerResponse
                .ok()
                .contentType(APPLICATION_JSON)
                .body(fromObject(response));
    }
}
