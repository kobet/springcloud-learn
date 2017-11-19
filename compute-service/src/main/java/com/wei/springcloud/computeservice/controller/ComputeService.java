package com.wei.springcloud.computeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo.InstanceStatus;
import com.netflix.discovery.DiscoveryClient;

@RestController
public class ComputeService {
	
//	@Autowired
//	private DiscoveryClient client;
	
	@RequestMapping("/add")
	public Integer compute(@RequestParam( "a")Integer a , @RequestParam( "b") Integer b){
		Integer result = a + b;
		
//		InstanceStatus instance = client.getInstanceRemoteStatus();
//		System.out.println("instance name is :" + instance.name());
		
		return result;
	}

}
