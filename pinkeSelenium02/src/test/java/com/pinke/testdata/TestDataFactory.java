package com.pinke.testdata;

import org.testng.annotations.DataProvider;

public class TestDataFactory {
	@DataProvider(name="calc_test_data")
	public static Object[][] getCalcTestData(){
		Object[][] objs = new Object[][] {
			{10,20,30},
			{30,10,20},
			{30,30,60}
		};
		return objs;
	}
	
	@DataProvider(name="calc_excel_data")
	public static Object[][] getCalcExcelData(){
		return ReadExcelUtils.getExcelData("calcTestData.xlsx");
	}
	
	@DataProvider(name="calc_mysql_data")
	public static Object[][] getCalcMysqlData(){
		String url = "jdbc:mysql:///cloud5?characterEncoding=UTF8&serverTimezone=CST";
		String username = "root";
		String password = "";
		String tableName = "calctestdata";
		return ReadDatabaseUtils.getDataFromDB(url, username, password, tableName);
	}
	
	@DataProvider(name="ecshop_login_data")
	public static Object[][] getEcshopLoginData(){
		Object[][] objs = ReadCSVUtils.getPlainCSVData("ecshopLoginTestData.csv");
		for(int i = 0; i < objs.length; i++) {
			objs[i][1] = objs[i][1] + "";
		}
		return objs;
	}
}
