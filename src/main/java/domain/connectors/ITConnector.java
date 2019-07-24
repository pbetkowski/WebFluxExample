//package domain.connectors;
//
//
//import domain.model.ITUser;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import reactor.core.publisher.Flux;
//
//@Component
//@AllArgsConstructor
//@NoArgsConstructor
//public class ITConnector {
//
//    @Autowired
//    private ITUseRepository itUseRepository;
//
//    public Flux<ITUser> getUsers() {
//        return Flux.fromIterable(itUseRepository.findAll());
//    }
//}
