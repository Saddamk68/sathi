package com.sathi.sim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({"com.sathi.sim.controller"})
public class Application {

  public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
