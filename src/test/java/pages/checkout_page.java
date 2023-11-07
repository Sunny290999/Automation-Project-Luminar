package pages;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class checkout_page
{
   WebDriver driver;
	
   @FindBy(xpath="//*[@id='billing-address-select']")
   WebElement newaddr;

   @FindBy(name="BillingNewAddress.CountryId")
   WebElement country;
	    
   @FindBy(name="BillingNewAddress.City")
   WebElement city;
	    
   @FindBy(name="BillingNewAddress.Address1")
   WebElement address;
	    
   @FindBy(name="BillingNewAddress.ZipPostalCode")
   WebElement zip;
	    
   @FindBy(name="BillingNewAddress.PhoneNumber")
   WebElement phno;
   
   @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/div/input")
   WebElement continuebutton;
	    
   @FindBy(xpath="//*[@id='shipping-buttons-container']/input")
   WebElement continuebutton2;
	    
   @FindBy(id="shippingoption_1")
   WebElement nextdayair;
	    
   @FindBy(xpath="//*[@id='shipping-method-buttons-container']/input")
   WebElement continuebutton3;
	    
   @FindBy(xpath="//*[@id='paymentmethod_2']")
   WebElement credcard;
	    
   @FindBy(xpath="//*[@id='payment-method-buttons-container']/input")
   WebElement continuebutton4;

   @FindBy(xpath="//*[@id='CreditCardType']")
   WebElement cardtype;
	    
   @FindBy(xpath="//*[@id='CardholderName']")
   WebElement cardholdername;
	    
   @FindBy(xpath="//*[@id='CardNumber']")
   WebElement cardno;
	    
   @FindBy(xpath="//*[@id='ExpireMonth']")
   WebElement expmon;
	    
   @FindBy(xpath="//*[@id='ExpireYear']")
   WebElement expyear;
	    
   @FindBy(xpath="//*[@id='CardCode']")
   WebElement code;
	    
   @FindBy(xpath="//*[@id='payment-info-buttons-container']/input")
   WebElement continuebutton5;
	    
   @FindBy(xpath="//*[@id='confirm-order-buttons-container']/input")
   WebElement confirmbutton;
   
   @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div")
   WebElement orderconfirmation;
	    
public checkout_page(WebDriver driver)
  {
	this.driver=driver;
    PageFactory.initElements(driver,this);
  }

public void addaddress()
  {  
	//Select newaddress = new Select(newaddr);
 	//newaddress.selectByVisibleText("New Address");
 	
	Select Country = new Select(country);
 	Country.selectByVisibleText("Kuwait");
 	
 	city.sendKeys("Salmiya");
 	address.sendKeys("al shaheed park");
 	zip.sendKeys("54541");
 	phno.sendKeys("1234567890");
  }
	
public void checkout()
  {
	 continuebutton.click();
	 continuebutton2.click();
	 nextdayair.click();
	 continuebutton3.click();
	 credcard.click();
	 continuebutton4.click();
	 
	 Select type=new Select(cardtype);
	 type.selectByVisibleText("Master card");
	 	
	 cardholdername.sendKeys("ssxsb");
	 cardno.sendKeys("5425233430109903");

	 Select expm=new Select(expmon);
	 expm.selectByValue("7");
	 	
	 Select expy=new Select(expyear);
	 expy.selectByIndex(9);

	 code.sendKeys("8765");
	 continuebutton5.click();
  }

public void confirmorder()
  {
	confirmbutton.click();
  }
	
public void orderscreenshot() throws Exception
  {
	File orderscr=orderconfirmation.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(orderscr, new File("./Screenshot/OrderConfirmation.png"));
	
	System.out.println("\n Order Placed Successfully");
	System.out.println();
  }

}