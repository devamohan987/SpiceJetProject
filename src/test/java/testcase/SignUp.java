package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class SignUp extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		
		excelfile="SignUp";
		
	}
	@Test(dataProvider="getData")
	
	
	public void signUpTest(String title,String firstname,String lastname,String country,String month ,String year,String phoneno,
			String email,String password ,String password1 ) throws InterruptedException, IOException {
		
		new HomePage(driver)
		.clickSignUp()
		.switchToSignUpPage()
		.selectTitle(title)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.ClickDatePicker()
		.selectMonth(month)
		.selectYear(year)
		.selectMonth(month)
		.selectDate()
		.enterPhNo(phoneno)
		.enterMailId(email)
		.enterPassword(password)
		.enterConfitmPassword(password1)
		.clickEyeBox1()
		.scrolltoSubmit()
		.clickCheckBox()
		.clickSubmitButton()
		.screenshot("SignUp");
		
		
		
		
	}
	
}
