package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class LogInPage extends ProjectSpecification {

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[4]")
	WebElement emailcheckbox;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	WebElement email1;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[2]")
	WebElement pword;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-utggzx r-1otgn73']")
	WebElement eyebox;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement loginbutton;
	
	@FindBy(xpath="//div[text()='Hi Saranya']")
	WebElement loginmsg;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	WebElement phno;
	
	@FindBy(xpath="//div[text()='Invalid Username/Password']")
	WebElement invalidmsg;
	
	@FindBy(xpath="//div[text()='Please enter a valid email address']")
	WebElement invalidmail;
	
	@FindBy(xpath="//div[text()='Please enter a valid password']")
	WebElement invalidpassword;
	
	//@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[2]")
	//WebElement password;
		
	
	//constructor initialization 
	public LogInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	public LogInPage clickEmailCheckBox() {
		click(emailcheckbox);
		return this;
	}
	
	public LogInPage enterEmail(String email) {
		sendKeys(email1,email);
		return this;
	}
	
	public LogInPage enterPassword(String pass) {
		sendKeys(pword,pass);
		return this;
		
	}
	
	public LogInPage clickEyeBox() {
		click(eyebox);
		return this;
	}

	public LogInPage verifyLoginMessage(String text) throws InterruptedException {
		sleep();
		waitForVisible(loginmsg);
		validateText(loginmsg,text);
		return this;
	}
	
	public HomePage verifyLoginPage(String title) throws InterruptedException {
		sleep();
		validateTitle(title);
		return new HomePage(driver);
		
	}
	
	public LogInPage clickLogInButton() throws InterruptedException {
		actionClick(loginbutton);
		//sleep();
		return this;
	}
	
	public LogInPage enterPhoneNo(String phone) {
		 sendKeys(phno, phone);
		return this;
	}

	public LogInPage verifyInvalidMessage(String text) {		
		validateText(invalidmsg,text);		
		return this;
	}
	
	public LogInPage verifyInvalidEmailMessage(String text) {		
		validateText(invalidmail,text);		
		return this;
	}
	
	public LogInPage verifyInvalidPasswordMessage(String text) {		
		validateText(invalidpassword,text);		
		return this;
	}
	
}
