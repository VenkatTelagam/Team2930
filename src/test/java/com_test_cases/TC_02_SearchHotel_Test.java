package com_test_cases;

import org.testng.annotations.Test;

import com_Reusuable_Class.BaseClass;
import com_page_objects.LoginPage;
import com_page_objects.SearchHotelPage;

public class TC_02_SearchHotel_Test extends BaseClass {
	
	public LoginPage lp;
	public SearchHotelPage sh;
	
	@Test
	public void SearchHotelTest() {
		
		//Login
		lp=new LoginPage(driver);
		lp.setUsername();
		lp.setPassword();
		lp.clickLoginButton();
		
		//Search Hotel
		sh=new SearchHotelPage(driver);
		sh.setLocation();
		sh.setRoomNo();
		sh.setDatePickIn();
		sh.setDatePickOut();
		sh.clickSearchButton();
		
		
	}

}
