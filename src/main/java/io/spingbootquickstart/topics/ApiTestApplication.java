package io.spingbootquickstart.topics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@EnableJpaRepositories(basePackages = "io.spingbootquickstart.topics")
//@SpringBootApplication(scanBasePackages={
//        "io.sprinbootquickstart.hello", "io.spingbootquickstart.topics"})

//@ComponentScan("io.spingbootquickstart.topics")
@SpringBootApplication
public class ApiTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApiTestApplication.class, args);
    }

}