package com.pinke.webdriver.utils;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteLogWebDriver extends RemoteWebDriver{
	
	private Logger logger;
	
	public RemoteLogWebDriver(URL url, Capabilities caps, Class<?> clazz) {
		super(url, caps);
		logger = LogManager.getLogger(clazz);
	}
	
	@Override
	public WebElement findElementByLinkText(String using) {
		try {
			WebElement element = super.findElementByLinkText(using);
			logger.info(using+"定位已找到元素");
			return element;
		} catch(NoSuchElementException e) {
			logger.error(using+"定位未找到元素");
			throw e;
		}
	}
	
	@Override
	public WebElement findElementByXPath(String using) {
		try {
			WebElement element = super.findElementByXPath(using);
			logger.info(using+"定位已找到元素");
			return element;
		} catch(NoSuchElementException e) {
			logger.error(using+"定位未找到元素");
			throw e;
		}
	}
	
	@Override
	public WebElement findElementByName(String using) {
		try {
			WebElement element = super.findElementByName(using);
			logger.info(using+"定位已找到元素");
			return element;
		} catch(NoSuchElementException e) {
			logger.error(using+"定位未找到元素");
			throw e;
		}
	}
}
