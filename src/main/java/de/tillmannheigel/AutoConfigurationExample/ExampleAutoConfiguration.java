package de.tillmannheigel.AutoConfigurationExample;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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


    @Bean
    @ConditionalOnProperty(
            name = "isRomeReallyNecessaryForThisApplication",
            havingValue = "true")
    @ConditionalOnMissingBean
    public Double creationOfRome() {
        return 753D;
    }
}
