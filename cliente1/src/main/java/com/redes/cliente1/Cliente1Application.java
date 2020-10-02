package com.redes.cliente1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Cliente1Application implements CommandLineRunner {

	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Cliente1Application.class);
        app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		 RestTemplate rest = new RestTemplate();
		 
	     String enpointResult = rest.getForObject("http://127.0.0.1:2000", String.class);
	     System.out.println(enpointResult);
	     
	     String runBatResult = rest.getForObject("http://" + enpointResult + ":2004", String.class);
	     System.out.println(runBatResult);
	}

}
