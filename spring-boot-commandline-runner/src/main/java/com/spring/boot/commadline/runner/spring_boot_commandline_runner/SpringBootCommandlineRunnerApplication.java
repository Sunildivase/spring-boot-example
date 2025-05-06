package com.spring.boot.commadline.runner.spring_boot_commandline_runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class SpringBootCommandlineRunnerApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringBootCommandlineRunnerApplication.class);

	@Override
	public void run(String... args) throws Exception {

		logger.info("Total NonOptionArgs: {}", args.length);
		Arrays.stream(args).forEach(name -> logger.info("{} = {} ",name,args));
	}
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootCommandlineRunnerApplication.class, args);
	}

}
