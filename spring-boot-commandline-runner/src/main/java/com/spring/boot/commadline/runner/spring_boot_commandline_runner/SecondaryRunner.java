package com.spring.boot.commadline.runner.spring_boot_commandline_runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SecondaryRunner implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(SecondaryRunner.class);

    @Override
    public void run(String... args) throws Exception {

        logger.info("Message from secondary runner");
    }
}
