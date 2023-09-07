package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Link : https://demoapp.skillrary.com/product.php?product=selenium-training

public class AddtocartPage
{
	@FindBy(id = "add")
	private WebElement addbtn;
	
	@FindBy(className = "btn btn-primary btn-lg btn-flat")
	private WebElement cartBtn;
	
	public AddtocartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getaddingbutton()
	{
		return addbtn;
	}
	public void addToCartOption()
	{
		cartBtn.click();
		
	}
}
