package homw;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import object.object;
import resources.base;

public class LandingPage extends base {
	
public static	Logger log =LogManager.getLogger(LandingPage.class);
	@Test(dataProvider="data1")
	public void data(String username ,String password) throws IOException
	{
		driver=Invoke();
		driver.get("https://www.rediff.com/");
		object o1=new object(driver);
		o1.redifflogin().click();
		o1.rediffuser().sendKeys(username);
		o1.rediffpass().sendKeys(password);
		o1.rediffsubmit().click();
		log.info("username and password verified");
	
		
	}
	
	@DataProvider
	public Object[][] data1()
	{
		Object[][] ob = new Object[2][2];
		ob[0][0] = "siya";
		ob[0][1] = "Acharya";
		ob[1][0] = "vardhan";
		ob[1][1] = "xyz";
		return ob;
	}
	
	

}
