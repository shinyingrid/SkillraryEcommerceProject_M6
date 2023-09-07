package genericLibraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass

{
	public WebDriver driver;
	
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtilites utilities = new WebDriverUtilites();
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("//https://www.skillrary.com/");
	}
	
	@AfterMethod
	public void closeApp(ITestResult res)throws IOException
	{
		int status = res.getStatus();
		String name =res.getName();
		if(status==2)
		{
			photo p = new photo();
			p.getPhoto(driver, name);
			
		}
		driver.quit();
	}
}
