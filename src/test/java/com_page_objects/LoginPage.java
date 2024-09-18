package com_page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Login page divided into 3-parts

	//1.Constructor
	//2.identify the web elements
	//3.Create the actions

	//1.Constructor-->same name like class name

	public WebDriver driver; //remote webDriver
	public LoginPage(WebDriver driver) { //Local WebDriver

		this.driver=driver; //amiguity issues	
		PageFactory.initElements(driver, this);	
	}

	//2.identify the web elements

	@FindBy(id="username")
	WebElement txtUsername;

	@FindBy(id="password")
	WebElement txtPassword;

	@FindBy(id="login")
	WebElement btnLogin;



	//3.Create the actions

	public void setUsername() {

		txtUsername.sendKeys("Venkat1997");  
	}
	
	public void setPassword() {
		txtPassword.sendKeys("73A35C");
	}
	
	public void clickLoginButton() {
		
		btnLogin.click();
	}

}
