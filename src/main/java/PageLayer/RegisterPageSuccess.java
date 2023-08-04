package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import static UtilsLayer.TakesScreenShot.*;
import java.io.IOException;
import BaseLayer.BaseClass;
import UtilsLayer.TakesScreenShot;

public class RegisterPageSuccess extends BaseClass
{
	@FindBy(xpath="//img[@alt='Mercury Tours']")
	private WebElement pageLogo; 
	@FindBy(xpath="//a[text()=' sign-in ']")
	private WebElement signIn;

	
	public RegisterPageSuccess()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void registerPageSuccessFunctinality(WebElement scenario) 
	{
		pageLogo.TakesScreenShot();
		click(signIn);
	}

}
