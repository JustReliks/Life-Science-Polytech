package ru.lifesciencepolytech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LifeScienceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifeScienceApplication.class, args);
    }

}
