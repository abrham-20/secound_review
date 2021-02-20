package first_review_m;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class xpath {
	
	WebDriver Driver;
	
	@Test
	
	public  void xpath1(){
		
		 Driver = new FirefoxDriver();
		 System.getProperty("Webdriver.firefox.driver", ".\\driver_f\\Firefox Installer (1).exe");
		 Driver.manage().window().maximize();
		 Driver.manage().deleteAllCookies();
		 Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Driver.get("https://techfios.com/billing/?ng=dashboard/");
		 Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		 Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		 Driver.findElement(By.xpath("//button[@name='login']")).click();
		 //or we can use this kind of xpath 
		//div[@class='m-top-md p-top-sm']/descendant::button[@name='login'] this Descendant Example  
		 //by using this xpath we have the same result whit this top line cod
		 //other path //div[@id='page-wrapper']/child::div[@class='row border-bottom']/following-sibling::*
		 //the combine of child and following-sibling 
		//follwoing-sibling,descendant,child,ancestor,
	}

}
