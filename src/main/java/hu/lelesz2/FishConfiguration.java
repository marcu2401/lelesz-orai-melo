package hu.lelesz2;

import hu.lelesz2.components.Fish;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({FishProperty.class})
public class FishConfiguration {
    final FishProperty fishproperty;

    public FishConfiguration(FishProperty fishproperty) {
        this.fishproperty = fishproperty;
        System.out.println(fishproperty.getSize());
    }

    @Bean
    Fish fish(){
        return new Fish();

    }
}
