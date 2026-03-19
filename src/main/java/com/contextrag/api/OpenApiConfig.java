package com.contextrag.api;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Supplies OpenAPI metadata for the generated Swagger documentation.
 */
@Configuration
public class OpenApiConfig {

    /**
     * Builds the OpenAPI document metadata for the service.
     *
     * @return configured OpenAPI instance
     */
    @Bean
    public OpenAPI contextRagOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("ContextRAG API")
                        .description("API documentation for the ContextRAG service")
                        .version("v1")
                        .contact(new Contact().name("ContextRAG")));
    }
}
