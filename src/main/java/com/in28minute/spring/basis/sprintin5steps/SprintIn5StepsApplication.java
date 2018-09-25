package com.in28minute.spring.basis.sprintin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprintIn5StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(SprintIn5StepsApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
	}
}
