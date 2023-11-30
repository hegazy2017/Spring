package com.Tada.FileManipulation.config;


import java.util.HashSet;
import java.util.Set;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket getDocketInstanceEx1() {
		final Set<String> produces = new HashSet<String>();
		produces.add(MediaType.APPLICATION_JSON_VALUE);

		return new Docket(DocumentationType.OAS_30)
				.apiInfo(new ApiInfoBuilder()
						.title("File API")
						.description("A File API to upload file integration")
						.version("0.0.1")
						.license("hegazy1.0")
						.licenseUrl("https://opensource.org/licenses/fileLicense")
						.contact(new Contact("dev-team", "https://www.dev-team.com/", "eng.hegazy2009@gmail.com"))
						.build())
				.produces(produces).consumes(produces)
				.select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.build();
	}

}