package domain.router;


import domain.handler.WeatherHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class WeatherRouter {

    private static final String END_POINT = "/weather";

    @Bean
    public RouterFunction<ServerResponse> userRouter(WeatherHandler weatherHandler) {
        return route(GET(END_POINT + "/parsedData"), weatherHandler::getParsedData);
    }
}
