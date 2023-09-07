package genericLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class photo
{
	public void getPhoto(WebDriver driver, String name) throws IOException 
	{
	Date d = new Date(); //error - dont import from sql date but java.util.date
	String currentdate  = d.toString().replaceAll(":", "-");

	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	FileOutputStream dest = new FileOutputStream(IPathConstant.photoPath+currentdate+name+".png");
	FileUtils.copyFile(src, dest);
	}
}


//*inside util package we have a class called Date. 
//Date d = new Date(); error - dont import from sql date but java.util.dateimport java.sql.Date;
//* Here we use Date class because the screenshot should be taken on the particular date of execution*/
/*.driver - if it asks to create a local variable, check the import statement import org.openqa.selenium.WebDriver; 
Still if it doesnt clear, remove and re-enter the declaration - WebDriver driver*/