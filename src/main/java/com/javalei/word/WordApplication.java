package com.javalei.word;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.javalei.word.controller")
@SpringBootApplication
public class WordApplication {

	public static void main(String[] args) {
		System.out.println(args.length);
		for (int i = 0; i <args.length ; i++) {
			System.out.println(args[i]);
		}

		SpringApplication.run(WordApplication.class, args);
	}
}
