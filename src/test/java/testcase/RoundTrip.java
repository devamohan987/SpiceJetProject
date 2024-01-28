package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class RoundTrip extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		
		excelfile="RoundTrip";
		
	}
	@Test(dataProvider="getData")
	
	public void roundTripTest(String from,String to,String firstname,String lastname,String phone,String mail1,String town
			,String number,String name,String month,String year,String code,String msg) throws InterruptedException, IOException {
		
		new HomePage(driver)
		.clickFlights()
		.clickRoundTrip()
		.enterFrom(from)
		.enterTo(to)
		.enterDepartureDate()
		.enterReturnDate()
		.clickFlightSearch()
		.clickContinue()
		.selectTitle1()
		.enterFirstName1(firstname)
		.enterLastName1(lastname)
		.enterContactNo(phone)
		.enterEmail(mail1)
		.enterCity(town)		
		.clickCheckBox()
		.clickContinue1()
		.clickContinue2()
		.enterCardNo(number)
		.enterCardName(name)
		.enterMonth(month)
		.enterYear(year)
		.enterCVVNo(code)
		.clickProceedToPay()
		.verifyMessage(msg)
		.screenshot("RoundTrip");
		
		
		
	}
	
}
