package com.pinke.ecshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	@FindBy(linkText="免费注册")
	private WebElement register_link;
	
	@FindBy(xpath="//a[@href='user.php']")
	private WebElement login_link;
	
	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void goRegist() {
		register_link.click();
	}
	
	public void goLogin() {
		login_link.click();
	}
}
