package first_review_m;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Web_elment {

		
		 WebDriver Driver;
	@Test
		public  void element() throws Exception{
			
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
//			Driver.findElement(By.xpath(""));
//			Driver.findElement(By.className(""));
			
			By ELEMENT_by_locator = By.xpath("//h2[contains(text(),' Dashboard ')]");
			
			boolean page_title;
			try{
				WebElement ELEMENT = Driver.findElement(By.xpath("//h2[contains(text(),' Dashboard ')]"));
				page_title = true;
			}catch(NoSuchElementException e){
				page_title = false;
				e.printStackTrace();
			}
			
			
			//WebelementWait example
			WebDriverWait wait = new WebDriverWait(Driver,3);
		//wait.until(ExpectedConditions.visibilityof(driver.findElement(By.name(" "))));
			// instead of using driver.findElement(By.name(" ")))) this all we can decraile as Webelemnt
			

			wait.until(ExpectedConditions.visibilityOfElementLocated(ELEMENT_by_locator));
			
			Assert.assertTrue("page not found", page_title);
			Driver.close();
		}
		@Test
	
	public void Element(){
		Driver = new FirefoxDriver();
		System.setProperty("Webdriver.firefox.driver", ".\\driver_f\\Firefox Installer (1).exe");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://techfios.com/billing/?ng=dashboard/");
		WebElement user_name_fild = Driver.findElement(By.id("username"));
		user_name_fild.clear();
		user_name_fild.sendKeys("demo@techfios.com");
		WebElement user_name_filds=Driver.findElement(By.xpath("//input[@id='password']"));
		user_name_filds.clear();
		user_name_filds.sendKeys("abc123");
		WebElement enter = Driver.findElement(By.xpath("//button[@name='login']"));
		enter.clear();
		enter.click();
		WebDriverWait wait = new WebDriverWait(Driver,2);
		wait.until(ExpectedConditions.visibilityOf(user_name_fild));
		
		Assert.assertTrue("page not found", user_name_filds.isDisplayed());
		
		Driver.close();
	
		
		
	}
		//@Test
		public void test(){
			Assert.assertEquals(false, true);
		}
		//@Test
	public void Test2(){
		Assert.assertTrue("no such element found", true);
	}
		//@Test
		public void test3(){
			Assert.assertEquals(false, false);
			
		}



}
