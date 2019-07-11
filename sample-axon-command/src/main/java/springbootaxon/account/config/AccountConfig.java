package springbootaxon.account.config;

import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springbootaxon.account.aggregate.AccountAggregate;

@Configuration
public class AccountConfig {

    @Bean
    EventSourcingRepository<AccountAggregate> accountAggregateEventSourcingRepository(EventStore eventStore){
        EventSourcingRepository<AccountAggregate> repository = new EventSourcingRepository<AccountAggregate>(AccountAggregate.class, eventStore);
        return repository;
    }
}