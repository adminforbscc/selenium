package com.pinke.testdata;

import org.testng.annotations.DataProvider;

public class TestDataFactory {
	
	@DataProvider(name="ecshop_login_data")
	public static Object[][] getEcshopLoginData(){
		Object[][] objs = ReadCSVUtils.getPlainCSVData("ecshopLoginTestData.csv");
		for(int i = 0; i < objs.length; i++) {
			objs[i][1] = objs[i][1] + "";
		}
		return objs;
	}
}
