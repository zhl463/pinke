package com.pinke.test.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LogTest {
	private static Logger logger = LogManager.getLogger();
	@Test
	public void logTest1(){
		logger.info("1哈哈，test1");
	}
	@Test
	public void logTest2(){
		logger.warn("1哈哈，test2");
	}
	@Test
	public void logTest3(){
		logger.debug("1哈哈，test3");
	}
	@Test
	public void logTest4(){
		logger.error("1哈哈，test4");
	}
}
