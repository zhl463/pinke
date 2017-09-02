package com.pinke.test.demo;

import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeTestNGDemo2Class...");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterTestNGDemo2Class...");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod...");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod...");
	}
	@Test
	public void test1() {
		System.out.println("test1...");
		assertEquals(10, 10);
	}
	@Test
	public void test2() {
		System.out.println("test2...");
		assertEquals(10, 10);
	}
}
