package com.contextrag.api;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI contextRagOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("ContextRAG API")
                        .description("API documentation for the ContextRAG service")
                        .version("v1")
                        .contact(new Contact().name("ContextRAG"))
                        .license(new License().name("Proprietary")));
    }
}
