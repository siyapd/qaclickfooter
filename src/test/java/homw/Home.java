package homw;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Loader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import object.object;
import resources.base;

public class Home extends base{
	public static Logger log = LogManager.getLogger(Home.class);
	@Test
	public void getdata() throws IOException, InterruptedException
	{
		
 driver=Invoke();
 driver.get("http://www.qaclickacademy.com/");
 log.info("browser opened");
int size=driver.findElements(By.xpath("//button[text()='NO THANKS']")).size();
if(size>0)
{
	driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
}

JavascriptExecutor js = (JavascriptExecutor)driver;
WebElement element = driver.findElement(By.xpath("//div[@id='links']/nav/ul/li[1]"));
js.executeScript("arguments[0].scrollIntoView(true);", element);
Thread.sleep(500); 


 
 object o =new object(driver);
o.link1();

log.info("links opened");
	}

	

}
