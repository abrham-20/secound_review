package first_review_m;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {
	WebDriver Driver;
	@Test
	public void example_for_dropdown(){
		Driver = new FirefoxDriver();
		System.setProperty("Webdriver.firefox.driver", ".\\driver_f\\Firefox Installer (1).exe");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://techfios.com/billing/?ng=dashboard/");
		Driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		Driver.findElement(By.id("password")).sendKeys("abc123");
		Driver.findElement(By.name("login")).click();
		Driver.findElement(By.xpath("/html/body/section/div/nav/div/ul/li[3]/a/span[1]")).click();
		Driver.findElement(By.xpath("/html/body/section/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
		WebElement element =Driver.findElement(By.xpath("//select[@id='cid']"));
		
		Select sel = new Select(element);
		sel.selectByVisibleText("Raul Automotive");
	}

}
