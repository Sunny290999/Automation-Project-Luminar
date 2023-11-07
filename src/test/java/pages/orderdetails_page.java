package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderdetails_page
{
    WebDriver driver;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
    WebElement continuebutton;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[2]/a")
    WebElement orders;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/input")
    WebElement orderdetails;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[1]/a[2]")
    WebElement pdfinvoice;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement logout;

public orderdetails_page(WebDriver driver)
  {
    this.driver=driver;
	PageFactory.initElements(driver,this);
  }

public void orderdetails() 
  {
	continuebutton.click();
	orders.click();
	orderdetails.click();
  }

public void pdfinvoice() 
  {
	pdfinvoice.click();
  }

public void logout() 
  {
	logout.click();
  } 

}