package com.techanything.jenkin.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinsAppTest {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsAppTest.class);

	@Test
	public void contextLoads() {
		logger.info("Configuring Pipeline Dev - UAT - Prod ");
		logger.info("Test case executing...");
		assertEquals(true, true);
	}
}
