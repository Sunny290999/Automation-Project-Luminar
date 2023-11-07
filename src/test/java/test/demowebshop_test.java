package test;

import org.testng.annotations.Test;

import basepkg.baseclass_for_demowebshop_by_tricentis;
import pages.addtocart_page;
import pages.checkout_page;
import pages.login_page;
import pages.orderdetails_page;
import pages.registration_page;

public class demowebshop_test extends baseclass_for_demowebshop_by_tricentis
{
  @Test
  public void DemowebshopPageTest() throws Exception
			      {
	                registration_page rp = new registration_page(driver);
	                rp.registration();
	                rp.RegistrationSuccessfulScreenshot();
	                rp.logout();
           
	                login_page lp=new login_page(driver);
                    lp.login();
			        lp.loginvalidation();
			        lp.logo_verification();
			        lp.logo_screenshot();
			        
                    addtocart_page adcp=new addtocart_page(driver);
		            adcp.selectcellphones();
		            adcp.cellphonespagedropdownshandling();
		            adcp.productviewmodedropdownshandling();
		            adcp.productdetailsandwishlist();
		            adcp.addtocart();
		            
		            checkout_page cop=new checkout_page(driver);
		            cop.addaddress();
		            cop.checkout();
		            cop.confirmorder();
		            cop.orderscreenshot();
		            
		            orderdetails_page odp=new orderdetails_page(driver);
		            odp.orderdetails();
		            odp.pdfinvoice();
		            odp.logout();
			      }
}