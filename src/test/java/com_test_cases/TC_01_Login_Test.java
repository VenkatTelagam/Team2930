package com_test_cases;

import org.testng.annotations.Test;

import com_Reusuable_Class.BaseClass;
import com_page_objects.LoginPage;


public class TC_01_Login_Test extends BaseClass {
	
	
	public  LoginPage lp;
	
	@Test
	public void loginTest() {
		
		lp=new LoginPage(driver);
		
	    lp.setUsername();
	    lp.setPassword();
	    lp.clickLoginButton();	
	}
}
