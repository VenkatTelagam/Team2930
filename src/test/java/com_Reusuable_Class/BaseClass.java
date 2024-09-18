package com_Reusuable_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	// this class implement the common functionalities of every test cases
	// open application,close application
	
	public static WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void openApplication(String br,String URL) {
		
		if(br.equals("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(br.equals("edge")){
			driver=new EdgeDriver();
			
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void closeApplication() {
		driver.close();
	}

}
