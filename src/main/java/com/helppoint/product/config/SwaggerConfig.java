package com.helppoint.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfo(
            "Help Point Product REST API",
            "Help Point Product",
            "1.0.0",
            "Terms of service",
            new Contact("Help Point", "www.helppoint.com", "tech@helppoint.com"),
            "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0",
            Collections.emptyList()
        );
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.helppoint.product"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
    }

}
