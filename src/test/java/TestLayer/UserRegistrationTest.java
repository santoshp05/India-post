package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.UserRegistration;

public class UserRegistrationTest extends BaseClass {

	@BeforeTest
	public void setUp() {
		BaseClass.intitialization();
	}
	
	@Test
	public void verifyPostIndiaRegPage() {
		
		UserRegistration reg=new UserRegistration();
		reg.UserRegistrationvarification("user12", "Mr.", "santosh", "patil", "What is your Birth Place?", "Kolhapur",
		"New Yashwant", "Kasaba Bawada", "Kolhapur", "India", "Maharashtra", "KOLHAPUR", "3837", "santosh@gmail.com", "8898898989");
	}
	
	@AfterTest
	public void tearDown(){
		//driver.quit();
		
	}
}
