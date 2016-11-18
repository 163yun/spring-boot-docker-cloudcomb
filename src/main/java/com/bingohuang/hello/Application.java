package com.bingohuang.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sprint Boot 主应用入口
 * @author <a href="http://bingohuang.com">bingohuang.com</a>
 * @date 2016.11.15
 */
@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Spring Boot, Docker and CloudComb!";
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
