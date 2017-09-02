package com.pinke.test.demo;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class MyListener extends TestListenerAdapter {
	@Override
	public void onTestFailure(ITestResult tr) {
		String name = tr.getMethod().getMethodName();
		Reporter.log("测试方法："+name+"执行失败了");
		System.err.println("----> "+name);
	}
}
