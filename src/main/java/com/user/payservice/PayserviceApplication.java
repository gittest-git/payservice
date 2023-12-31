package com.user.payservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PayserviceApplication {

	@GetMapping("/hellopay")
	public String sayHello()
	{
		return "Hello! from pay service";
	}

	public static void main(String[] args) {
		SpringApplication.run(PayserviceApplication.class, args);
	}

}
