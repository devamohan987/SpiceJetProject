package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class OneWayTrip extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		
		excelfile="OneWayTrip";		
	}	
	@Test(dataProvider="getData")
	
	public void oneWayTripTest(String from,String to,String firstname,String lastname,String phone,String mail1,String town,String fname,String lname
			,String number,String name,String month,String year,String code,String msg) throws IOException, InterruptedException {
		
		new HomePage(driver)
		.clickFlights()
		.enterFrom(from)
		.enterTo(to)
		.enterDepartureDate()
		.clickPassengers()
		.addChildren()
		.clickFlightSearch()
		.clickContinue()
		.selectTitle1()
		.enterFirstName1(firstname)
		.enterLastName1(lastname)
		.enterContactNo(phone)
		.enterEmail(mail1)
		.enterCity(town)
		.clickCheckBox()
		.clickNext()
		.selectTitlePassenger2()
		.enterfname(fname)
		.enterlname(lname)
		.clickContinue1()
		.clickContinue2()
		.enterCardNo(number)
		.enterCardName(name)
		.enterMonth(month)
		.enterYear(year)
		.enterCVVNo(code)
		.clickProceedToPay()
		.verifyMessage(msg)
		.screenshot("OneWayTrip");
		
		
	}
	
}
