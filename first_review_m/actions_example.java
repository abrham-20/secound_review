package first_review_m;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actions_example {
	WebDriver Driver;
	@Test
	 public void Action_class(){
		Driver = new FirefoxDriver();
		System.setProperty("Webdriver.firefox.driver", ".\\driver_f\\Firefox Installer (1).exe");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://techfios.com/billing/?ng=dashboard/");
		Driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		Driver.findElement(By.id("password")).sendKeys("abc123");
		
		Actions act = new Actions(Driver);
		act.sendKeys(Keys.ENTER).perform();
	}

}
