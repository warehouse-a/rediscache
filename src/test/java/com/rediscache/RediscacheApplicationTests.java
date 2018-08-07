package com.rediscache;

import com.rediscache.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RediscacheApplicationTests {

	@Autowired
	private TestService testService;


	@Test
	public void contextLoads() {
		testService.redisIns(1);
	}
	@Test
	public void redisController(){
		testService.redisGet("redis");
	}

}
