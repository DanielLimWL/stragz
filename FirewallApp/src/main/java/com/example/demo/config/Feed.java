package com.example.demo.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@PropertySource("classpath:configprops.properties")
@ConfigurationProperties(prefix = "feed")
public class Feed {
    private Map<String, List<String>> feedToStages;

}
