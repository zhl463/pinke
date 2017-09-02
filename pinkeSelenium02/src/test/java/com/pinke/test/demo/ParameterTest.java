package com.pinke.test.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@Parameters(value= {"name","age"})
	@Test
	public void test1(String n, int a) {
		System.out.println("--->"+n+", "+a);
	}
}
