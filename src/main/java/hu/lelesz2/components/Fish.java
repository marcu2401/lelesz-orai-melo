package hu.lelesz2.components;

import com.google.common.eventbus.EventBus;
import hu.lelesz2.CatchFish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


public class Fish {
    private EventBus busz;


    @Autowired
    void setBusz(EventBus busz){
        this.busz=busz;
    }

    @PostConstruct
    public void catched(){
        this.busz.post(new CatchFish());
    }


}
