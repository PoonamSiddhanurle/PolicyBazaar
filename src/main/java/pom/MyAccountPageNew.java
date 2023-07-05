package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageNew {
    //variable
	@FindBy(name="personName")private WebElement userName;
	
	//constructor
	public MyAccountPageNew(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	
	//Methods
	public void clickOnUserName()
	{
		userName.click();
	}
	public String getActualUn()
	{
		
        String actualUn=userName.getText();
		return actualUn;
		
	}
	

}
