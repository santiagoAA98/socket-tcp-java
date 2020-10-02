package com.redes.servidor2.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunBatController {

	@GetMapping
	public String runBat() throws IOException {
		Runtime.getRuntime().exec("cmd /c hello.bat", null,
				new File("C:\\Users\\Anderson Vargas\\Desktop\\ADVM\\Poli\\REDES\\SOCKET\\socket-tcp-java\\"));
		return "sucess";
	}
}
