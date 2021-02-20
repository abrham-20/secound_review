package first_review_m;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class config_file {
	
	//To read file this file helpful 
	//first inputStream
	//bufferedreader
	//fileReader
	//scanner
	String browser;
	@BeforeTest
	public void pro_file(){
		
		Properties pro_file = new Properties();
		
		try{
			InputStream input = new FileInputStream("./src/main/java/config/Properties/config.Properties");
			pro_file.load(input);
			browser = pro_file.getProperty("browser");
			System.out.println(pro_file.getProperty("browser"));
			System.out.println(pro_file.getProperty("name"));
			System.out.println(pro_file.getProperty("age"));
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	WebDriver Driver;
	
	@Test
	public void config_example() throws InterruptedException{
		
		
		if(browser.equalsIgnoreCase("firefox")){
			//System.out.println(browser);
		}else {
			System.out.println(browser);
		}
		Driver = new FirefoxDriver();
		System.setProperty("Webdriver.firefox.driver", ".\\driver_f\\Firefox Installer (1).exe");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		//window handle is use for show the result to the console what page you get 
		//so to user window  handle just Systemeout.print it's give you handle your windows
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getWindowHandles());
		Driver.get("https://www.yahoo.com/");
		Driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("xpath");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//li[@pos='1']")).click();
		//Driver.findElement(By.xpath("//input[@class='sbb']")).click();
		Driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getWindowHandle());
		for(String i:Driver.getWindowHandles()){
			System.out.println(i);
			Driver.switchTo().window(i);
			Driver.close();
	}
	}
}
