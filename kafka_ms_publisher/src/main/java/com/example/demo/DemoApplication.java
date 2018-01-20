package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class DemoApplication {

	@Autowired
	private Producer producer;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



	@GetMapping(value = "/demo", produces = APPLICATION_JSON_VALUE)
	public Map getName() {

		producer.send("demo");

		Map map = new HashMap();
		map.put("Hello", "World");
		return map;
	}
}
