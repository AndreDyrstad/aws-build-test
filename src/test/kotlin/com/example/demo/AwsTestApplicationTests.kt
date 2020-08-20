package com.example.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AwsTestApplicationTests {

	@Test
	fun contextLoads() {
		val a = 1
		val b = 2
		assertEquals(a+b, 6)
	}
}
