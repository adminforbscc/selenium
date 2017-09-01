package com.pinke.ecshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.*;

public class LoginPage {
	
	@FindBy(name="username")
	private WebElement username_input;
	
	@FindBy(name="password")
	private WebElement password_input;
	
	@FindBy(name="submit")
	private WebElement submit_btn;
	
	@FindBy(xpath="//div[@class='box_1']/div/div/p")
	private WebElement login_result_text;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin(String username, String password) {
		username_input.sendKeys(username);
		password_input.sendKeys(password);
		submit_btn.click();
	}
	
	public void assertLoginResult(String expected) {
		assertEquals(login_result_text.getText(), expected);
	}
	
}
