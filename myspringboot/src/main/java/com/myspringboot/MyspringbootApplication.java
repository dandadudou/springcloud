package com.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaServer
@SpringBootApplication
public class MyspringbootApplication {

    @Bean
    RestTemplate restTemplate() {
        		return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }
}
