package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//https://www.skillrary.com/

public class SkillraryLoginPage 
{
	//Declaration
	//Address of gear WebElement
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbutton;
	
	//Address of skillrary demo
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//Address of search text field
	@FindBy(name="q")
	private WebElement searchTab;
	
	//Address of search icon
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchbtn;
	
	//**************************************************************
	
	//INITIALIZATION
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//*****************************************************************
	//UTILIZATION
	
	public void gearsbutton()
	{
		gearsbutton.click();  //declared WebElement gearsbutton
	}
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}
	public void searchTextbox(String name)
	{
		searchTab.sendKeys(name);
	}
	public void gobutton()
	{
		searchbtn.click();
	}
	
}
