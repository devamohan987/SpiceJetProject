package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SignInPage extends ProjectSpecification {

	@FindBy(xpath="//div[@class='col-sm-4 mt-2 px-sm-4']//select[contains(@class,'form-control form-select')]")
	WebElement title;
	
	@FindBy(id="first_name")
	WebElement fname;
	
	@FindBy(id="last_name")
	WebElement lname;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(xpath="//img[@class='d-inline-block datepicker']")
	WebElement datepicker;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement selectyear;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement selectmonth;
	
	@FindBy(xpath="//div[text()='22']")
	WebElement selectdate;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement phoneno;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement mailid;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	
	@FindBy(xpath="(//img[@class='icon-active'])[1]")
	WebElement eyebox;
	
	@FindBy(id="c-password")
	WebElement confpassword;
	
	@FindBy(xpath="(//img[@alt='eye-icon'])[2]")
	WebElement eyebox1;
	
	@FindBy(xpath="//input[@class='form-check-input mt-02']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit;
	
	@FindBy(xpath="(//div[@class='font-13 mt-10 inlineErrors'])[1]")
	WebElement errormessage;
	
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	public SignInPage switchToSignUpPage() throws InterruptedException {
		sleep();
		switchToWindow();
		return this;
	}
	
	public SignInPage selectTitle(String value) throws InterruptedException {
		sleep();
		select(title,value);
		return this;
				
	}
	
	public SignInPage enterFirstName(String firstname) throws InterruptedException {
		sleep();
		sendKeys(fname,firstname);
		return this;
				
	}
	
	public SignInPage enterLastName(String lastname) throws InterruptedException {
		
		sendKeys(lname,lastname);
		return this;
				
	}
	
	public SignInPage country(String value) {
		select(country,value);
		return this;
			
	}
	
	public SignInPage ClickDatePicker() {
		click(datepicker);
		return this;
	}
	
	public SignInPage selectMonth(String value) throws InterruptedException {
		sleep();
		select(selectmonth,value);
		return this;
	}
	
	public SignInPage selectYear(String value) {
		select(selectyear,value);
		return this;
	}
	
	public SignInPage selectDate() {
		click(selectdate);
		return this;
	}
	
	public SignInPage enterDate() {
		
		return this;
	}
	
    public SignInPage enterPhNo(String phno ) {		
		sendKeys(phoneno, phno);
		return this;
	}
    
     public SignInPage enterMailId(String email) {		
	    sendKeys(mailid, email);
		return this;
	}

     public SignInPage enterPassword(String pword) {    	
    	 sendKeys(password, pword);
    	 return this;
    	
    }
    
     
     public SignInPage enterConfitmPassword(String conpword) {    	
   	     sendKeys(confpassword, conpword);
   	     return this;
   	
   }
     
     public SignInPage clickEyeBox1() {    	
    	 click(eyebox1);
    	 return this;
    	
    }
    
     public SignInPage clickCheckBox() {    	
    	jsClick(checkbox);
    	return this;
    }
    
     public SignInPage clickSubmitButton() {   
    	 try {
    	click(submit);}
    	 catch(Exception e) {
    		 System.out.println("button not click");
    	 }
    	return this;
    }
     
     public SignInPage scrolltoSubmit() throws InterruptedException {
 		scrolldown(submit);
 		return this;
 	}
     
     public SignInPage verifyErrorMessage(String excepted) throws InterruptedException {
 		scrollup();
 		validateText(errormessage,excepted);
 		return this;
 	}
}
