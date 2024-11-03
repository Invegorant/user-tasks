package com.invegorant.user_tasks;

import org.springframework.boot.SpringApplication;

public class TestUserTasksApplication {

	public static void main(String[] args) {
		SpringApplication.from(UserTasksApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
