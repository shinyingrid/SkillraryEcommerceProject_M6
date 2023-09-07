package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile
{
	//This is a generic method to read data from property file. It is not required to create a generic method for excel sheet
	public String getPropertydata(String key) throws IOException
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(IPathConstant.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
		
		/* Create an object for the properties class and get the input from the path declared. So we use FileInputStream class
		 Then we are loading the input to the object. Whenever this method is called with a key, the value of the key is returned
		 to this method */
	}
}
