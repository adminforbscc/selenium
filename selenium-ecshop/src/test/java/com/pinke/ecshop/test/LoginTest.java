package com.pinke.ecshop.test;

import org.testng.annotations.Test;

import com.pinke.ecshop.pages.IndexPage;
import com.pinke.ecshop.pages.LoginPage;
import com.pinke.ecshop.testutils.BaseTest;
import com.pinke.testdata.TestDataFactory;

public class LoginTest extends BaseTest {
	@Test(dataProviderClass=TestDataFactory.class, dataProvider = "ecshop_login_data")
	public void loginTest1(String username, String password,String result) {
		driver.get("http://localhost/ecshop/");
		IndexPage indexPage = new IndexPage(driver);
		indexPage.goLogin();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(username,password);
		//System.out.println(driver.getPageSource());
		loginPage.assertLoginResult(result);
	}

}
