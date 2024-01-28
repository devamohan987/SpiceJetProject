package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class FlightBookingPage extends ProjectSpecification {

	@FindBy(xpath="//div[text()='round trip']")
    WebElement roundtrip;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement from;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;
	
	@FindBy(xpath="(//div[text()='28'])[1]")
	WebElement departure;
	
	@FindBy(xpath="(//div[text()='31'])[1]")
	WebElement returndate;
	
	@FindBy(xpath="//div[text()='1 Adult']")
	WebElement passangers;
	
	@FindBy(xpath="//div[text()='1 Adult, 1 Child']")
	WebElement addpassengers;
	
	@FindBy(xpath="//div[@data-testid='Children-testID-plus-one-cta']")
	WebElement addchildren;
	
	//@FindBy(xpath="//div[text()='Search Flight']")
	//WebElement searchflight;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement continuebutton;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement title1;
	
	@FindBy(xpath="(//div[text()='Mrs'])[1]")
	WebElement Mrs;
	
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	WebElement contactno;
	
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement email;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	WebElement country;
	
	@FindBy(xpath="//div[text()='India']")
	WebElement india;
	
	@FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
	WebElement city;
	
	@FindBy(xpath="//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	WebElement firstname1;
	
	@FindBy(xpath="//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	WebElement lastname1;
	
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement continuebutton1;
	
	@FindBy(xpath="//div[text()='I am flying as the primary passenger']")
	WebElement primarypassenger;
	
	//@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-ah5dr5 r-1otgn73'])[3]")
	//WebElement continuebutton2;
	
	@FindBy(xpath="(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement continuebutton2;
	
	//@FindBy(xpath="(//div[text()='Continue'])[3]")
	//WebElement continuebutton2;
	
	@FindBy(id="card_number")
	WebElement cardno;
	
	@FindBy(id="name_on_card")
	WebElement cardname;
	
	@FindBy(id="card_exp_month")
	WebElement expmonth;
	
	@FindBy(id="card_exp_year")
	WebElement expyear;
	
	@FindBy(id="security_code")
	WebElement cvvno;
	
	@FindBy(xpath="//div[text()='Proceed to pay']")
	WebElement proccedtopay;
	
	@FindBy(xpath="//div[text()='Invalid Card Details']")
	WebElement invalidmessage;
	
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	WebElement frame1;
	
	@FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	WebElement frame2;
	
	@FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	WebElement frame3;
	
	@FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
	WebElement frame4;
	
	@FindBy(xpath="//iframe[@class='security_code_iframe']")
	WebElement frame5;
	
	@FindBy(xpath="//div[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//div[@data-testid='traveller-1-title-field']")
	WebElement titlepassenger2;
	
	@FindBy(xpath="//div[text()='Miss']")
	WebElement Miss;	
	
	@FindBy(xpath="(//div[@data-testid='spiceflex-flight-select-radio-button-1'])[1]")
	WebElement flex;
	
	@FindBy(xpath="(//div[@data-testid='spicemax-flight-select-radio-button-2'])[6]")
	WebElement max;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-ymp9ed r-1j3t67a r-1w50u8q r-ah5dr5 r-1otgn73 r-1n20pny']")
	WebElement modify_search;
	
	@FindBy(xpath="(//div[text()='4'])[4]")
	WebElement modify_date;
	
	@FindBy(xpath="//span[text()='Sun, 04 Feb 2024']")
	WebElement modified_msg;
	
	@FindBy(xpath="(//div[text()='Mon, 15 Jan 2024'])[2]")
	WebElement original_date;
	
	//constructor initialization 
	public FlightBookingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	public FlightBookingPage clickRoundTrip() {
		click(roundtrip);
		return this;		
		
	}
	
	public FlightBookingPage enterFrom(String city) throws InterruptedException {
		click(from);
		sendKeys(from,city);
		return this;
	}
	
	public FlightBookingPage enterTo(String city) throws InterruptedException {
		clear(to);
		sendKeys(to,city);
		return this;
	}
	
	public FlightBookingPage enterDepartureDate() throws InterruptedException {
		sleep();
		waitForVisible(departure);
		click(departure);
		return this;		
	}
	
	public FlightBookingPage enterReturnDate() {
		waitForVisible(returndate);
		click(returndate);
		return this;
	}	
		
	
	public FlightBookingPage clickPassengers() {
		click(passangers);
		return this;
		
	}
	
	public FlightBookingPage addChildren() {
		click(addchildren);
		click(addpassengers);
		return this;
	}
	
	public FlightBookingPage clickFlightSearch() {
		click(searchflight);
		return this;
		
	}
	
	public FlightBookingPage clickContinue() {
		click(continuebutton);
		return this;
	}
	
	public FlightBookingPage selectTitle1( ) throws InterruptedException {		
		click(title1);
		click(Mrs);
		return this;
	}
	
	public FlightBookingPage enterFirstName1(String fname) throws InterruptedException	{
		clear(firstname);
		sendKeys(firstname,fname);
		return this;
	}

	public FlightBookingPage enterLastName1(String lname) throws InterruptedException {
		clear(lastname);
		sendKeys(lastname,lname);
		return this;
	}

	public FlightBookingPage enterContactNo(String no) throws InterruptedException	{
		clear(contactno);
		sendKeys(contactno,no);
		return this;
	}

	public FlightBookingPage enterEmail(String mail) throws InterruptedException	{
		
		clear(email);
		sendKeys(email,mail);
		return this;
	}
	
	public FlightBookingPage selectCountry()	{
		click(country);
		click(india);
		return this;
	}
	
	public FlightBookingPage enterCity(String town) throws InterruptedException	{
		clear(city);
		sendKeys(city,town);
		return this;
		
	}
	
	public FlightBookingPage clickCheckBox() {
		moveToElement(primarypassenger);
		actionClick(primarypassenger);
		return this;
	}

	public FlightBookingPage enterfname(String fname)  {		
		sendKeys(firstname1,fname);
		return this;
	}

	public FlightBookingPage enterlname(String lname)  {			
		sendKeys(lastname1,lname);
		scrollup();
		return this;
	}

	public FlightBookingPage clickContinue1() throws InterruptedException {
		sleep();
		scrolldown(continuebutton1);
		actionClick(continuebutton1);
		
		return this;
	}
	 
	public FlightBookingPage clickContinue2() throws InterruptedException {
		sleep();
		scrolldown(continuebutton2);
		click(continuebutton2);
		return this;
	}
	
	public FlightBookingPage enterCardNo(String number)	{
		switchFrame(frame1);
		sendKeys(cardno,number);
		comeOutFromFrame();
		return this;
	}

	public FlightBookingPage enterCardName(String name)
	{
		switchFrame(frame2);
		sendKeys(cardname,name);
		comeOutFromFrame();
		return this;
	}
	 
	public FlightBookingPage enterYear(String year)
	{
		switchFrame(frame4);
		sendKeys(expyear,year);
		comeOutFromFrame();
		return this;
	}
	
	public FlightBookingPage enterMonth(String month) {
		switchFrame(frame3);
		sendKeys(expmonth,month);
		comeOutFromFrame();
		return this;
	}

	public FlightBookingPage enterCVVNo(String code)	{
		switchFrame(frame5);
		sendKeys(cvvno,code);
		comeOutFromFrame();
		return this;
	}

	//Method to click proceed to pay button 
	public FlightBookingPage clickProceedToPay() throws InterruptedException {
		sleep();
		scrolldown(proccedtopay);
		actionClick(proccedtopay);
		return this;
	}
	
	public FlightBookingPage verifyMessage(String excepted) {		
		waitForVisible(invalidmessage);
		validateText(invalidmessage,excepted);
		return this;
	}

	public FlightBookingPage selectTitlePassenger2() {
		moveToElement(titlepassenger2);		
		click(titlepassenger2);
		click(Miss);
		return this;
		
	}
	
	public FlightBookingPage clickNext() {		
		scrolldown(next);
		click(next);
		return this;
	}
	//Method to click Modify search button 
	public FlightBookingPage clickModifySearch() {
		waitForVisible(modify_search);
		click(modify_search);		
		return this;
		
	}

	//Method to modify the date 
	public FlightBookingPage clickModifyDate() {		
		waitForVisible(modify_date);
		click(modify_date);		
		return this;
		
	}

	//Method to click  the date 
	public FlightBookingPage clickOriginalDate() {		
		waitForVisible(original_date);
		click(original_date);		
		return this;
		
	}

	//Method to verify whether date is changed 

	public FlightBookingPage VerifyDepartureDate(String excepted) {		
		waitForVisible(modified_msg);
		validateText(modified_msg,excepted);		
		return this;
		
	}
	
}
