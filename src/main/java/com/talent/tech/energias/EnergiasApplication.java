package com.talent.tech.energias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.talent.tech.energias"})
public class EnergiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnergiasApplication.class, args);
	}

}
