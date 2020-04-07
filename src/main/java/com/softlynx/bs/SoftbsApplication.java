package com.softlynx.bs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.softlynx.bs.mapper")
@SpringBootApplication
public class SoftbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftbsApplication.class, args);
	}

}
