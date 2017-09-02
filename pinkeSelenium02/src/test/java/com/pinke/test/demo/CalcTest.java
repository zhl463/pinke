package com.pinke.test.demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import com.pinke.demo.Calc;
import com.pinke.testdata.TestDataFactory;

public class CalcTest {
	private Calc calc;
	@BeforeClass
	public void init() {
		calc = new Calc();
	}
	/*@DataProvider
	public Object[][] calcTestData(){
		Object[][] objs = new Object[][] {
			{10,20,30},
			{30,10,20},
			{30,30,60}
		};
		return objs;
	}*/
	@Test(dataProviderClass=TestDataFactory.class ,dataProvider="calc_mysql_data")
	public void testCompute1(int x, int y, int expected) {
		int actual = calc.compute(x, y);
		assertEquals(actual, expected);
	}
}
