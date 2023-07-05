package base;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base 
{
	
	static protected WebDriver driver;
    public void launchBrowser() throws InterruptedException
{
    ChromeOptions opt=new ChromeOptions();
    opt.addArguments("disable-notifications");
    driver=new ChromeDriver(opt);
    Thread.sleep(1000);
    driver.get("https://www.policybazaar.com/");
    driver.manage().window().maximize();
    //Thread.sleep(1000);
    //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
}
