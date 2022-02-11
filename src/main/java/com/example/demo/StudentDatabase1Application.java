package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDatabase1Application implements CommandLineRunner{
	@Autowired
	private org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(StudentDatabase1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql="INSERT INTO Student(id,name,email)VALUES("+" '2222','VARUN','varun@gmail.com')";
		
		
	int rows = JdbcTemplate.update(sql);
	
		if (rows > 0) {
			System.out.println("a new 2 rows has been inserted");
			
			
			 
		}
		
		
	}

}
