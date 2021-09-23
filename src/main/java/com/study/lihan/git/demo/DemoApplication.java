package com.study.lihan.git.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("修改1");
		System.out.println("修改2");
		System.out.println("正常合并分支");
		System.out.println("冲突合并分支1");
	}

}
