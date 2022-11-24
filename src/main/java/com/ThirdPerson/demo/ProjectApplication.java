package com.ThirdPerson.demo;

import com.ThirdPerson.demo.services.DashboardInterface;
import com.ThirdPerson.demo.services.ImageServiceInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	/*(@Bean
	CommandLineRunner run(DashboardInterface dashboardInterface, ImageServiceInterface imageServiceInterface){

		return args -> {

		}


	}*/

}
