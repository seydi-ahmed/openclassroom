package com.openclassrooms.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.openclassrooms.helloworld.service.BusinessService;

@SpringBootTest
class HelloworldApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private BusinessService bs;

	@Test
	public void testGetHelloWorld() {
		String hw = bs.getHelloWorld().getValue();
		String result = "Hello World!!!";

		assertEquals(hw, result);

	}
}
