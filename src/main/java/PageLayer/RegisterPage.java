package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass
{
	@FindBy(name="firstName")
	private WebElement firstName;
	@FindBy(name="lastName")
	private WebElement lastName;
	@FindBy(name="phone")
	private WebElement phoneNo ;
	@FindBy(name="userName")
	private WebElement emailId ;
	@FindBy(name="address1")
	private WebElement Address;
	@FindBy(name="city")
	private WebElement City ;
	@FindBy(name="state")
	private WebElement State;
	@FindBy(name="postalCode")
	private WebElement pinCode;
	@FindBy(name="country")
	private WebElement Country;
	@FindBy(name="email")
	private WebElement Email;
	@FindBy(name="password")
	private WebElement Password;
	@FindBy(name="confirmPassword")
	private WebElement cPassword;
	@FindBy(name="submit")
	private WebElement submitBtn;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void contactInfoFunctionality(String fname,String lname, String phone,String emailid)
	{
		sendKeys(firstName, fname);
		sendKeys(lastName, lname);
		sendKeys(phoneNo, phone);
		sendKeys(emailId, emailid);
	}
	public void mailingFunctionality(String Addr,String Cty,String state,String Pin,String country)
	{
		sendKeys(Address,Addr);
		sendKeys(City,Cty);
		sendKeys(State,state);
		sendKeys(pinCode, Pin);
		selectByVisibleText(Country, country);
	}
	
	public void userInfoFunctionality(String uname,String pass,String cpass)
	{
		sendKeys(Email, uname);
		sendKeys(Password, pass);
		sendKeys(cPassword, cpass);
		click(submitBtn);
	}
}
