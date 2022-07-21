package com.joalheria.joalheria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JoalheriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoalheriaApplication.class, args);
    }

}
