package com.ust.reminder.app.reminderapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ust.reminder.app.reminderapp")
public class ReminderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReminderAppApplication.class, args);
	}
}
