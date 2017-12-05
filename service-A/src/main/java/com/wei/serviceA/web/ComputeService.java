package com.wei.serviceA.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeService {

	// @Autowired
	// private DiscoveryClient client;

	@Autowired
	private DiscoveryClient client;

	@RequestMapping("/add")
	public Integer compute(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		Integer result = a + b;
		ServiceInstance instance = client.getLocalServiceInstance();
		// InstanceStatus instance = client.getInstanceRemoteStatus();
		System.out.println("request url is :" + instance.getUri() + "IP is :" + instance.getHost() + ",prot is :"
				+ instance.getPort() + ",result:" + result);

		return result;
	}

}
