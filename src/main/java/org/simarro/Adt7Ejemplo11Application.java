package org.simarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Adt7Ejemplo11Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Adt7Ejemplo11Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(Adt7Ejemplo11Application.class);
    }

}
