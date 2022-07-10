package com.manning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*This is main class*/
@SpringBootApplication
public class ReadingListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingListApplication.class, args);
		System.out.print("This is my first commet");
		System.out.print("This is my Second commet");
		System.out.print("This is my fourth commet");
	}

}
