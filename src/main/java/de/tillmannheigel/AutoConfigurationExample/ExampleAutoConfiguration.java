package de.tillmannheigel.AutoConfigurationExample;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleAutoConfiguration {

    @Bean
    public Integer integer() {
        return 5;
    }


    @Bean
    @ConditionalOnMissingBean(name = "answerToAllQuestions")
    public Long answerToAllQuestions() {
        return 42L;
    }
}
