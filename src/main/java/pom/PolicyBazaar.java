package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PolicyBazaar 
{
  //variable
	@FindBy(xpath="//a[text()='Sign in']")private WebElement signInButton;
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobNumber;
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]")private WebElement signInWithPassword;
	@FindBy(name="password")private WebElement password;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement SignIn;
	@FindBy(xpath="//div[@class='userprofile']")private WebElement myAccount;
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProfile;
	
	
  //constructor
	public PolicyBazaar(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
  //methods
	public void clickSignInButton()
	{
		signInButton.click();
	}
	public void enterMobileNumber()
	{   
		mobNumber.sendKeys("8261072161");
	}
	public void clickonPasswordButton()
	{   
		signInWithPassword.click();
	}
	public void enterPassword()
	{
		password.sendKeys("poonam@1234");
	}
	public void clickOnSignInButton()
	{   
		SignIn.click();
	}
	public void clickmyAccount()
	{   
		myAccount.click();
	}
	public void clickOnMyProfileButton()
	{
		myProfile.click();
	}
	

}


