package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {

	@FindBy(xpath="//div[text()='Signup']")
	WebElement signup;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa']")
	WebElement flights;
	
	//constructor initialization 
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	//click signup button & constructor chaining to signup page
	public SignInPage clickSignUp() throws InterruptedException {
		click(signup);
		sleep();
		return new SignInPage(driver);	
		
	}
	
	//click login button & constructor chaining to login page
	public LogInPage clickLogIn() {
		click(login);
		return new LogInPage(driver);
				
	}
	
	//click flight button & constructor chaining to FlightBookingPage page
	public FlightBookingPage clickFlights()  {		
		click(flights);	
		return new FlightBookingPage(driver);
    }
	
	
	//click logout button & constructor chaining to LogOutPage page
	public LogOutPage clickLogout()  {		
		return new LogOutPage(driver);
		
	}
	
}
