package io.springbootquickstart.apitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("io.sprinbootquickstart.hello")
@ComponentScan("io.spingbootquickstart.topics")
@SpringBootApplication
public class ApiTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApiTestApplication.class, args);
    }

}