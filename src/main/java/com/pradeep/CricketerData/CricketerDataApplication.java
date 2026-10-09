package com.pradeep.CricketerData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.pradeep.CricketerData","modelCricketer"})
public class CricketerDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketerDataApplication.class, args);
	}

}
