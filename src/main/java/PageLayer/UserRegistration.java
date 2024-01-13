package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.SelectDropDown;
import UtilityLayer.Wait;

public class UserRegistration extends BaseClass {

	@FindBy(xpath="//input[@title='User ID']")
	private WebElement userId;
	
	@FindBy(xpath="//select[@title='Title']")
	private WebElement title;//select
	
	@FindBy(xpath="//input[@title='First Name']")
	private WebElement fName;
	
	
	@FindBy(xpath="//input[@title='Last Name']")
	private WebElement lName;
	
	@FindBy(xpath="//select[@title='Hint Question']")
	private WebElement hindQstn; //select
	
	@FindBy(xpath="//input[@title='Hint Answer']")
	private WebElement hintAns;
	
	@FindBy(xpath="(//input[@title='Address'])[1]")
	private WebElement add;
	
	@FindBy(xpath="(//input[@title='Address'])[2]")
	private WebElement add1;
	
	@FindBy(xpath="(//input[@title='Address'])[3]")
	private WebElement add2;
	
	@FindBy(xpath="//select[@title='Country']")
	private WebElement country; //select
	
	@FindBy(xpath="//select[@title='State']")
	private WebElement state; //select
	
	@FindBy(xpath="//select[@title='City / District']")
	private WebElement city; //select
	
	@FindBy(xpath="//input[@title='Pincode']")
	private WebElement pinCode;
	
	@FindBy(xpath="//input[@title='Email']")
	private WebElement emailId;
	
	@FindBy(xpath="//input[@title='Mobile']")
	private WebElement mobileNo;
	
	
	public UserRegistration() {
		PageFactory.initElements(driver, this);
	}
	
	public void UserRegistrationvarification(String userID,String title1,String firstName,String lastName,String hintQstns,
			String hintAnswer,String address1,String address2, String address3,String Country,String State,String City,
			String pincode,String email,String mob ) {
		
		Wait.sendKeys(userId, userID);
		
		
		SelectDropDown.selectByVisibleText(title, title1);
		Wait.sendKeys(fName, firstName);
		Wait.sendKeys(lName, lastName);
		
		SelectDropDown.selectByVisibleText(hindQstn, hintQstns);
		
		Wait.sendKeys(hintAns, hintAnswer);
		Wait.sendKeys(add, address1);
		Wait.sendKeys(add1, address2);
		Wait.sendKeys(add2, address3);
		
		
		SelectDropDown.selectByVisibleText(country, Country);
		SelectDropDown.selectByVisibleText(state, State);
		SelectDropDown.selectByVisibleText(city,City);
		
		Wait.sendKeys(pinCode, pincode);
		Wait.sendKeys(emailId, email);
		Wait.sendKeys(mobileNo, mob);
		
		
		
		
		
		
		
		
	}
	
}
