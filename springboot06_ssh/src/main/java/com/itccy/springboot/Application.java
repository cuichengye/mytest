package com.itccy.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//创建SpringApplication
		SpringApplication springApplication = new SpringApplication(Application.class);
		//设置横幅
		springApplication.setBannerMode(Mode.OFF);
		//提交
		springApplication.run(args);
	}
}
