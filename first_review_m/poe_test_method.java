package first_review_m;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import first_dayreview.com.base_page_time;
import first_dayreview.com.dash_page;
import first_dayreview.com.page_object_model;
import first_dayreview.com.return_webDriver;
import first_dayreview.com.sale;
import first_dayreview.com.transaction_select;


public class poe_test_method extends base_page_time {
	WebDriver driver;
	@Test
	public void poe_test() throws InterruptedException{
		
		driver = return_webDriver.launchbrowser();
		
		//page_object_model poe = new page_object_model();
		page_object_model poes = PageFactory.initElements(driver, page_object_model.class);
		poes.enterelemnt_name("demo@techfios.com");
		poes.enterelemntpass("abc123");
		poes.enterelemntlogin();
		transaction_select transfer = PageFactory.initElements(driver, transaction_select.class);
		transfer.transaction1();
		transfer.new_drop();
		transfer.select_drop();
		
		sale sale_fild = PageFactory.initElements(driver, sale.class);
		sale_fild.sale();
		sale_fild.account();
	    sale_fild.invoice_button();
		
		dash_page dash = PageFactory.initElements(driver, dash_page.class);
		dash.dashpage();
		return_webDriver.tearedown();
		
		
	}

}
