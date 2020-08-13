package com.weifengcui.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test: runt this command to start the server
 * mvnw spring-boot:run
 *
 * Followed https://spring.io/quickstart
 */
@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //http://localhost:8080/hello?name=Will
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }


    // Followed https://spring.io/guides/gs/rest-service/#initial built a simple RESTful API.
    // The following method return a object in JSON format.
    //http://localhost:8080/user?name=Will
    @GetMapping("/user")
    public User user(@RequestParam(value = "name", defaultValue = "Weifeng") String name) {
        return new User(1, name, "unset");
    }

}
