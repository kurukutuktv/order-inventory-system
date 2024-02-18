package com.app.salesinventory;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class SalesinventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalesinventoryApplication.class, args);
    }
//    @Bean
////    public CorsFilter corsFilter() {
////        CorsConfiguration corsConfiguration = new CorsConfiguration();
////        corsConfiguration.setAllowCredentials(true);
////        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
////        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
////                "Accept", "Authorization", "Origin, Accept", "X-Requested-With",
////                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
////        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
////                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
////        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
////        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
////        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
////        return new CorsFilter(urlBasedCorsConfigurationSource);
////    }
@Bean
CorsConfigurationSource corsConfigurationSource() {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.setAllowedOrigins(Collections.singletonList("http://localhost:3000"));
    configuration.setAllowedMethods(Arrays.asList("GET","POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
    configuration.setExposedHeaders(Arrays.asList("Authorization", "content-type"));
    configuration.setAllowedHeaders(Arrays.asList("Authorization", "content-type"));
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return source;
}
}
