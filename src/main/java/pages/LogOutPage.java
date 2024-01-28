package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class LogOutPage extends ProjectSpecification {

	@FindBy(xpath="//div[text()='You have been successfully logged out.']")
	WebElement logoutmsg;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj'])[1]")
	WebElement logoutbutton;
	
	@FindBy(xpath="//div[text()='Hi Deva']")
	WebElement loginmsg;
	
	//constructor initialization 
	public LogOutPage(WebDriver driver) {				
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	public LogOutPage verifyLogoutMessage(String text) {			
		validateText(logoutmsg,text);			
		return this;
	}
	
	public LogOutPage clickUserName() {
		click(loginmsg);
		return this;
	}
	
	public LogOutPage clickLogoutButton() {
		click(logoutbutton);
		return this;
	}
	
}
