package UtilsLayer;


import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class TakesScreenShot extends BaseClass
{
	
	public static String TakesScreenshot(String foldername, String screenshotname) throws IOException
	{
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"//"+foldername+"//"+screenshotname+date()+".png";
		FileUtils.copyFile(f, new File (path));
		return path;
	}	
	
	public static String date()
	{
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date(0));
	}
		
		
	
}