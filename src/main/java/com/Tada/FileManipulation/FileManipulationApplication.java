package com.Tada.FileManipulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.Tada.FileManipulation.property.FileStorageProperties;


@EnableWebMvc
@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class FileManipulationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileManipulationApplication.class, args);
	}

}
