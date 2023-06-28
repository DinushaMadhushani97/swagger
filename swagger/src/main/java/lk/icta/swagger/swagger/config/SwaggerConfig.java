package lk.icta.swagger.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.select()                                  
                .apis(RequestHandlerSelectors.any())              
                .paths(PathSelectors.any())                          
                .build();    
    }

//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//            .title("New Course Management API")                   // New API title
//            .description("API endpoints for managing new courses") // New API description
//            .contact(new Contact("New Course", "https://www.newcourse.com/", "newcourse@gmail.com")) // New contact information
//            .license("MIT")                                       // New license
//            .licenseUrl("https://opensource.org/licenses/MIT")     // New license URL
//            .version("2.0.0")                                     // New API version
//            .build();
//    }

}
