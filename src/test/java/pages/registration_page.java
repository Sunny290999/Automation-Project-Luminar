package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registration_page
{
    WebDriver driver;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement Register;
		
	@FindBy(id="gender-male")
	WebElement Gender;
		
	@FindBy(id="FirstName")
	WebElement Firstname;
		
	@FindBy(id="LastName")
	WebElement Lastname;
		
	@FindBy(id="Email")
	WebElement Email;
		
	@FindBy(id="Password")
	WebElement Password;
		
	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPassword;
		
	@FindBy(id="register-button")
	WebElement Registerbutton;
	
	@FindBy(xpath="//*[@href='/logout']")
	WebElement Logout;

public registration_page(WebDriver driver)
  {
	this.driver=driver;
    PageFactory.initElements(driver,this);
  }
		
public void registration()
  {
	 String email="hgcgucab@gmail.com";
	 String pswd="acbdts@3#jj";
	 
     Register.click();
	 Gender.click();
	 Firstname.sendKeys("abc");
	 Lastname.sendKeys("xyz");
	 Email.sendKeys(email);
	 Password.sendKeys(pswd);
	 ConfirmPassword.sendKeys(pswd);
	 Registerbutton.click();
  }

public void RegistrationSuccessfulScreenshot() throws IOException
  {
	File regscr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(regscr, new File("./Screenshot/RegistrationSuccessful.png"));
	
	System.out.println("\n Registration Completed Successfully");
  }

public void logout()
  {
	Logout.click();
  }

}