package com.wei.springcloud.eurekaribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wei.springcloud.eurekaribbon.service.ComputeService;

@RestController
public class RibbonController {
	
	@Autowired
	private ComputeService computeService;
	
	@RequestMapping("/add")
	public String ribbon() {
		return computeService.addService();
	}

}
