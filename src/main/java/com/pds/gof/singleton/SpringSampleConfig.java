package com.pds.gof.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringSampleConfig {
    @Bean
    public StringBuilder getStringBuilder() {
        return new StringBuilder();
    }
}
