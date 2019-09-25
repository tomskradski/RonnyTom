package com.radar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;

@SpringBootApplication
public class RonnyTomApplication {

	@Bean
	public SimpleMailMessage emailTemplate(){
		SimpleMailMessage message = new SimpleMailMessage();
		message.setText("This is a test referral email\n" +
				"First Name: %s\n" +
				"Last Name: %s\n" +
				"Tooth: %s\n" +
				"Comments: %s\n" +
				"Sent from: ReferralGenie v0.1");
		return message;
	}

	public static void main(String[] args) {
		SpringApplication.run(RonnyTomApplication.class, args);
	}

}
