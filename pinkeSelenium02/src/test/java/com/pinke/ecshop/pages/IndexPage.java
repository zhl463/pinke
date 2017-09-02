package com.pinke.ecshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	/**
	 * 首页免费注册的链接
	 */
	@FindBy(linkText="免费注册")
	private WebElement register_link;
	
	/**
	 * 首页登录链接
	 */
	@FindBy(xpath="//a[@href='user.php']")
	private WebElement login_link;
	
	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 点击免费注册链接
	 */
	public void goRegist() {
		register_link.click();
	}
	
	/**
	 * 点击登录链接
	 */
	public void goLogin() {
		login_link.click();
	}
}
