package hu.lelesz2;


import hu.lelesz2.components.Lake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LakeConfiguration {

    public LakeConfiguration() {
        System.out.println("létrejött e!");
    }

    @Bean
    public Lake lake(){
        return new Lake();
    }

}
