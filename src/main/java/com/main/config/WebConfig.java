package com.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods(HttpMethod.GET.name()
                        , HttpMethod.POST.name()
                        , HttpMethod.PATCH.name()
                        , HttpMethod.PUT.name()
                        , HttpMethod.DELETE.name()
                        , HttpMethod.HEAD.name()
                        , HttpMethod.OPTIONS.name())
                .maxAge(3600L)
                .allowCredentials(false);
    }
}