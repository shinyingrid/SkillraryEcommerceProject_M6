package Scripts;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;
import PomPages.AddtocartPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericLibraries.baseClass;

public class TestCase1 extends baseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage sk = new SkillraryLoginPage(driver);
		//created an object for SkillraryLoginPage and passed the driver for upcasting. 
		
		sk.gearsbutton();
		//Then we have accessed the method from the SkillraryLoginPage class
		
		sk.skillrarydemoapplication();
		
		utilities.childWindow(driver);
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();
		 
		AddtocartPage d = new AddtocartPage(driver);
		utilities.doubleClick(driver, d.getaddingbutton());
		d.addToCartOption();
		utilities.alertPopUp(driver);
	
	}

}
