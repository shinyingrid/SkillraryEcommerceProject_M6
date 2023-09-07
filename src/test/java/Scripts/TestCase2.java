package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import PomPages.TestingPage;
import genericLibraries.baseClass;

public class TestCase2 extends baseClass
{
	@Test
	public void tc2() throws Throwable 
	{
		SkillraryLoginPage sPage = new SkillraryLoginPage(driver);
		sPage.gearsbutton();
		sPage.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sdPage = new SkillraryDemoLoginPage(driver);
		utilities.childWindow(driver);
		utilities.dropDown(sdPage.getCoursedd(), pdata.getPropertydata("coursedd"));
		TestingPage tp = new TestingPage(driver);
		utilities.dragdrop(driver, tp.getElementToDrag(), tp.getMoveTo());
	}
}
