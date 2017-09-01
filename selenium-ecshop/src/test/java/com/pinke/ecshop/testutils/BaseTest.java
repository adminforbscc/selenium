package com.pinke.ecshop.testutils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pinke.webdriver.utils.WebDriverUtils;

public class BaseTest {
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver = WebDriverUtils.getDriver("Chrome",this.getClass());
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
