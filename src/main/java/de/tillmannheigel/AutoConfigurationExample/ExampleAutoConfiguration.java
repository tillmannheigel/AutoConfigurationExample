package de.tillmannheigel.AutoConfigurationExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleAutoConfiguration {

    @Bean
    public Integer integer() {
        return 5;
    }
}
