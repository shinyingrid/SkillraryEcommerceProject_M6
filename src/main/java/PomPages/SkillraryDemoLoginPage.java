package PomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Link - https://demoapp.skillrary.com/

public class SkillraryDemoLoginPage 
{	//DECLARATION
	//address of course
	@FindBy(id="course")
	private WebElement coursetab;
	
	//address of Selenium Training
	@FindBy(xpath = "(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//Address of the course dropdown
	@FindBy(name="addresstype")
	private WebElement coursedropdown;
	
	//***************************************************
	//INITIALIZATION
	//creating a constructor for this class
		public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
		//************************************************
		//UTILIZATION
		
		public WebElement getCoursetab()
		{
			return coursetab;
		}
		//No setter method used because we do not want to give others access to modify
		
		public void seleniumtrainingtab()
		{
			seleniumtraining.click();
		}
		public WebElement getCoursedd()
		{
			return coursedropdown;
		}
}
