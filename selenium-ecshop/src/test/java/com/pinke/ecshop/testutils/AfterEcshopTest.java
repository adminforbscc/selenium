package com.pinke.ecshop.testutils;

import org.testng.annotations.AfterSuite;

import com.pinke.webdriver.utils.WebDriverUtils;

public class AfterEcshopTest {
	@AfterSuite
	public void stopService() {
		WebDriverUtils.stopService();
	}
}
