package com.pinke.ecshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.*;

public class LoginPage {
	
	/**
	 * 登录用户名输入框
	 */
	@FindBy(name="username")
	private WebElement username_input;
	
	/**
	 * 登录密码输入框
	 */
	@FindBy(name="password")
	private WebElement password_input;
	
	/**
	 * 登录提交按钮
	 */
	@FindBy(name="submit")
	private WebElement submit_btn;
	
	/**
	 * 登录提交后跳转的结果显示的文本区域
	 */
	@FindBy(xpath="//div[@class='box_1']/div/div/p")
	private WebElement login_result_text;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 执行登录操作，自动填入用户名和密码，并点击登录提交按钮
	 * @param username 输入的登录用户名
	 * @param password 输入的登录密码
	 */
	public void doLogin(String username, String password) {
		username_input.sendKeys(username);
		password_input.sendKeys(password);
		submit_btn.click();
	}
	
	/**
	 * 对登录提交之后的文本进行验证，如果一致则通过，不一致则报测试未通过
	 * @param expected 其他文本内容
	 */
	public void assertLoginResult(String expected) {
		assertEquals(login_result_text.getText(), expected);
	}
	
}
