package com.cogent.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsApplicationTests {

	static Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	@Test
	void contextLoads() {

		log.debug("Test case executed");

	}

}
