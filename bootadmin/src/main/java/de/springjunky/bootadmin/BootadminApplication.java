package de.springjunky.bootadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class BootadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootadminApplication.class, args);
	}
}
