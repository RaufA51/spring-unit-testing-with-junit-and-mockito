package com.in28minutes.unittesting.unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
// application.properties faylini custom basqa yerden oxumasi ucun asagidaki kimi yazmaq lazimdi
// @TestPropertySource(locations= {"classpath:test-configuration.properties"})
public class UnitTestingApplicationTests {

	@Test
	public void contextLoads() {
	}

}
