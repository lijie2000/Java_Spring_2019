package com.example.Helloworld;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication
{
	public static void main(String[] args)
	{
		SpringApplication application = new SpringApplication(HelloworldApplication.class);
		Map<String, Object> map = new HashMap<>();
		map.put("server.servlet.context-path", "/myContext");
		map.put("server.port", "9090");
		application.setDefaultProperties(map);
		application.run(args);
	}

	@RequestMapping(value = "/hello")
	public String hello()
	{
		return "Hello World";
	}
}
