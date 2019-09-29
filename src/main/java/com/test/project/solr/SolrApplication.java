package com.test.project.solr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SolrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolrApplication.class, args);
	}

}
