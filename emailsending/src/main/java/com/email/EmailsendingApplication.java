package com.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.email.MailApp.MailApp;

@SpringBootApplication
public class EmailsendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailsendingApplication.class, args);
		System.out.println("Hellooo");
		MailApp app=new MailApp();
		app.sendMail();
	}

}
