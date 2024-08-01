package io.github.pablitohaddad.footballfromscratch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication // para consumir apis externas
@EnableFeignClients
public class FootbalFromScratch{

    public static void main(String[] args) {
        SpringApplication.run(FootbalFromScratch.class, args);
    }

}
