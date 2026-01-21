package es.jastxz.micro_gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CorsConfig {

        @Bean
        public CorsWebFilter corsWebFilter() {
                CorsConfiguration config = new CorsConfiguration();

                // Permitir credenciales
                config.setAllowCredentials(true);

                // Orígenes permitidos
                config.setAllowedOrigins(Arrays.asList(
                                // "http://localhost:5173",
                                "https://cv.javig.org"));

                // Métodos permitidos
                config.setAllowedMethods(Arrays.asList(
                                "POST"));

                // Headers permitidos
                config.setAllowedHeaders(List.of("*"));

                // Headers expuestos
                config.setExposedHeaders(Arrays.asList(
                                "Access-Control-Allow-Origin",
                                "Access-Control-Allow-Credentials"));

                // Tiempo de caché de preflight
                config.setMaxAge(3600L);

                UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
                source.registerCorsConfiguration("/**", config);

                return new CorsWebFilter(source);
        }
}