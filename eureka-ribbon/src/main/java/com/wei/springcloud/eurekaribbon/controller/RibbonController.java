package com.wei.springcloud.eurekaribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/add")
	public String ribbon() {
		return restTemplate.getForEntity("http://compute-service/add?a=10&b=20", String.class).getBody();
	}

}
