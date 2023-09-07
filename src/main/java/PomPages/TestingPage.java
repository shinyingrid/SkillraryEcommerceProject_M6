package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Link: https://demoapp.skillrary.com/category.php?category=testing

public class TestingPage 
{
	@FindBy(id = "Selenium Training")
	private WebElement selDragOption;
	
	@FindBy(id = "cartArea")
	private WebElement moveToOption;
	
	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookLogo;
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getElementToDrag()
	{
		return selDragOption;
	}
	public WebElement getMoveTo()
	{
		return moveToOption;
	}
	public void facebookLogoOption() 
	{
		facebookLogo.click();
	}
}
