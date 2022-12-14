package br.com.erudio.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookServiceApplication8200 {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication8200.class, args);
	}

}
