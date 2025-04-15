package com.example.jdbc;

import com.example.jdbc.dao.HibernateDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) {

		ApplicationContext con = SpringApplication.run(JdbcApplication.class, args);

	}

}
