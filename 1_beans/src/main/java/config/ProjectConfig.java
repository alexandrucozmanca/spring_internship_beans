package config;

import beans.StandardBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
// this will instruct spring to look for component annotated beans
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    @Primary
    @Bean
    StandardBean bean1() {
        return new StandardBean("The primary bean");
    }

    @Bean(name = "bean_2")
//    or @Bean(value = "bean_2") or @Bean("bean_2)
    StandardBean bean2() {
        return new StandardBean("The second bean");
    }

    @Bean
    StandardBean bean3() {
        return new StandardBean("The third bean");
    }

    @Bean
    String stringPhrase() {
        return "stringPhrase";
    }

    @Bean
    String phraseString() {
        return "phraseString";
    }

    @Bean
    Integer nine() {
        return 9;
    }
}
