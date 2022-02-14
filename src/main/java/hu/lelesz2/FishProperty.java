package hu.lelesz2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@ConfigurationProperties(prefix="fish")
@PropertySource(value="classpath:application.properties", encoding="utf-8")
public class FishProperty {
    private @Getter @Setter Integer size;

    public FishProperty() {
        System.out.println("---");
    }
}
