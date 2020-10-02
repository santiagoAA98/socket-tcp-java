package com.redes.servidor1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnpointController {

	@Value("${server2.ip}")
	private String ipServer2;

	@GetMapping
	public String getEndpoint() {
		return ipServer2;
	}

}
