package hu.lelesz2.components;

import com.google.common.eventbus.EventBus;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Angler {
    private @Getter
    EventBus busz;

    @Autowired
    void setBusz(EventBus busz){
        this.busz=busz;
    }


    @PostConstruct
    void catchFish(){
        this.busz.register(this);
    }
}
