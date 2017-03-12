package com.complaintsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.complaintsms.controller.LogComplaintController;
import com.complaintsms.entity.Testtable;


@SpringBootApplication
public class ComplaintsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplaintsMsApplication.class, args);
	}
}

