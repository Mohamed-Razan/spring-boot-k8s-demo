package com.razan.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootKubernetesDemoApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "Deployed to kubernates successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKubernetesDemoApplication.class, args);
	}

}
