package hu.lelesz2;


import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EventbusConfiguration {


    public EventbusConfiguration() {
        System.out.println("létrejött e!");

    }

    @Bean
    public  EventBus eventBus(){
        return new EventBus();

    }
}
