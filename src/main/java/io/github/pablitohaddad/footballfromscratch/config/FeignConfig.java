package io.github.pablitohaddad.footballfromscratch.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
                template.header("X-Auth-Token", "47dbdd0b47d744ef8dad91daa123092e"); // api-key
            }
        };
    }
}