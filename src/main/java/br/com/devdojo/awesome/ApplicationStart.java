package br.com.devdojo.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication // Mesma coisa que inserir essas 3 anotações @EnableAutoConfiguration, @ComponentScan, @Configuration
public class ApplicationStart {
    public static void main(String[] args) {

        SpringApplication.run(ApplicationStart.class, args);
    }

}
