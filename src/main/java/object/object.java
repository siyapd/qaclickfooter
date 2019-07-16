package object;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class object {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(Object.class);

	public object(WebDriver driver) {
		this.driver = driver;

	}

public void link1() throws InterruptedException
{
	WebElement footer=driver.findElement(By.id("prefooter"));
	System.out.println(footer.findElements(By.tagName("a")).size());
	log.info("size of links in footer");
	WebElement column=footer.findElement(By.id("links"));
	int count=column.findElements(By.tagName("a")).size();
	System.out.println(column.findElements(By.tagName("a")).size());
	for(int i=1;i<count;i++)
	{
		column.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	}
	
	Set<String> s=driver.getWindowHandles();
	Iterator<String> it=s.iterator();
	Thread.sleep(3000);
	
	while(it.hasNext())
	{
		System.out.println(driver.switchTo().window(it.next()).getTitle());
		
	}
}
By login =By.xpath("//a[text()='Sign in']");
By user =By.id("login1");
By pass=By.id("password");
By submit=By.cssSelector(".proceed");


public WebElement redifflogin()
{
	return driver.findElement(login);
}
public WebElement rediffsubmit()
{
	return driver.findElement(submit);
}

public WebElement rediffuser()
{
	return driver.findElement(user);
}
public WebElement rediffpass()
{
	return driver.findElement(pass);
}




	//return null ;
	
}




