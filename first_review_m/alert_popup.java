package first_review_m;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert_popup {
	WebDriver Driver;
	@Test
	public void pop_up() throws InterruptedException{
		Driver = new FirefoxDriver();
		System.setProperty("Webdriver.firefox.driver", ".\\driver_f\\Firefox Installer (1).exe");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(2000);
		String ab = Driver.switchTo().alert().getText();
		System.out.println(ab);
		Driver.switchTo().alert().dismiss();;
		
		
		Driver.close();

	}

}
