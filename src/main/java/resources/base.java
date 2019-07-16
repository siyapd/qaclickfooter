package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class base {
public static 	WebDriver driver;
public static Logger log = LogManager.getLogger(base.class);

	@Test
	public WebDriver Invoke() throws IOException
	{
		Properties p=new Properties();
		FileInputStream scr =new FileInputStream("E:\\java\\eclipse_workspace\\FooterProject\\src\\main\\java\\resources\\file.properties");
		p.load(scr);
		
		p.getProperty("browser");
		log.info("browser invoke");
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		
		return driver;
		
		
		
	}

	public void screenshot(String result) throws IOException {
		// TODO Auto-generated method stub
		
		
		{
			File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	org.apache.commons.io.FileUtils.copyFile(f, new File( "E:\\test" + result +"snapshot.png"));
		}
		
	}
	

	
	
}
