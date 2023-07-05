package test;

import java.io.IOException;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import base.Base;
import utility.Utility;

public class Listener extends Base implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		try {
			Utility.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  @Override
   public void onTestSuccess(ITestResult result) 
   {
	Reporter.log("Tc "+result.getName()+ " is running successfully", true);
   }
  @Override
  public void onTestSkipped(ITestResult result) 
  {
	Reporter.log("TC "+result.getName()+ " skipped", true);
  }
  @Override
 	public void onTestStart(ITestResult result) 
  {
 	 Reporter.log("This method "+result.getName()+ " execution is started", true);
 	
 	}
}
