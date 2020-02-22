package com.example.demo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestComponent {
@Autowired
RestTemplate rest;
@Autowired
DiscoveryClient dc;
public String getOtherService() throws URISyntaxException {
	List<ServiceInstance> otherInstance = dc.getInstances("client2");
	if(null == otherInstance) {
		return "Other instance not found";
	} else {
		ServiceInstance instance = otherInstance.get(0);
	    final String baseUrl = "http://"+instance.getHost()+":"+instance.getPort() + "/client2";
	    URI uri = new URI(baseUrl);
	    ResponseEntity<String> result = rest.getForEntity(uri, String.class);
	    return result.getBody();
	}
}
}
