package first_review_m;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class maven_review_day1 {
	
	 WebDriver Driver;
	@Test
	public  void start() throws Exception{
		
		Driver = new FirefoxDriver();
		System.setProperty("Webdriver.firefox.driver", ".\\driver_f\\Firefox Installer (1).exe");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://techfios.com/billing/?ng=dashboard/");
		Driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		Driver.findElement(By.id("password")).sendKeys("abc123");
		Driver.findElement(By.name("login")).click();
		//Driver.findElement(By.className("login")).click();
//		Driver.findElement(By.xpath(""));
//		Driver.findElement(By.className(""));
//		
		
		
	}

}
