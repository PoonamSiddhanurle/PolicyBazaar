package test;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Base;
import pom.MyAccountPageNew;
import pom.PolicyBazaar;
import utility.Utility;

@Listeners(test.Listener.class)
public class ValidateUserName1 extends Base{
	//Object creations
  PolicyBazaar pb;
  MyAccountPageNew myAcc;
  
  
  @BeforeClass
  public void openBrowser() throws InterruptedException
  {   
	  Thread.sleep(1000);
	  launchBrowser();
	  pb=new PolicyBazaar(driver);
	  myAcc=new MyAccountPageNew(driver);
  }
  @BeforeMethod
  public void enterDetailse()
  {
	  
	  Utility.implicitWait(driver, 1000);
	  System.out.println("Click on Sign in Button");
	  pb.clickSignInButton();
	  Utility.implicitWait(driver, 1000);
	  System.out.println("Enter mobile number");
	  pb.enterMobileNumber();
	  Utility.implicitWait(driver, 1000);
	  System.out.println("Click on password Button");
	  pb.clickonPasswordButton();
	  Utility.implicitWait(driver, 1000);
	  System.out.println("Enter Password");
	  pb.enterPassword();
	  Utility.implicitWait(driver, 1000);
	  System.out.println("Click on Sign in with Password Button ");
	  pb.clickOnSignInButton();
	  Utility.implicitWait(driver, 1000);
	  System.out.println("Click on MyAccount button");
	  pb.clickmyAccount();
	  Utility.implicitWait(driver, 1000);
	  System.out.println("Click on MyProfile Button");
	  pb.clickOnMyProfileButton();
	  Utility.implicitWait(driver, 1000);
	  Set<String> allpageId = driver.getWindowHandles();
	  List<String>l=new ArrayList<>(allpageId);
	  Utility.implicitWait(driver, 1000);
	  driver.switchTo().window(l.get(1));
	  Utility.implicitWait(driver, 1000);
	  myAcc.clickOnUserName();
  }
  @Test
  public void verifyUserName() 
  {
	  String expected_userName="";
	  String actualUn=myAcc.getActualUn();
	  Assert.assertEquals(actualUn,expected_userName, "TC is failed exp and acutal are not match");
	  System.out.println("Actual and expected results are matched TC is passed");
	  
  }
}
