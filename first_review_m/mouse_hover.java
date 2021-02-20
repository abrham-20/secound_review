package first_review_m;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {

	WebDriver Driver;
	@Test
	public void mouse_hover_example(){
		Driver = new FirefoxDriver();
		System.setProperty("Webdriver.firefox.driver", ".\\driver_f\\Firefox Installer (1).exe");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://www.dell.com/en-us");
		WebElement element = Driver.findElement(By.xpath("//button[@id='l1']"));
		WebElement Element2 = Driver.findElement(By.xpath("//span[text()=' Laptops']"));
		
		Actions act = new Actions(Driver);
		act.moveToElement(element).build().perform();
		act.moveToElement(Element2).build().perform();
	}
}
