package com.pinke.test.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestGroups {
	@Test(groups= {"windows.g1"})
	public void test1() {
		System.out.println("test1...");
		assertEquals(10, 10);
	}
	@Test(groups= {"windows.g2"})
	public void test2() {
		System.out.println("test2...");
		assertEquals(10, 10);
	}
	@Test(groups= {"linux.g1","windows.g3"})
	public void test3() {
		System.out.println("test3...");
		assertEquals(10, 10);
	}
	@Test(groups= {"linux.g2"})
	public void test4() {
		System.out.println("test4...");
		assertEquals(10, 10);
	}
	@Test
	public void test5() {
		System.out.println("test5...");
		assertEquals(10, 10);
	}
}
