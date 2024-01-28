package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class LogInWithPhno extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		
		excelfile="LogInWithPhno";
		
	}
	@Test(dataProvider="getData")
	
	public void logInTestWithPhone(String phone,String password,String text,String title) throws IOException, InterruptedException {
		
		new HomePage(driver)
		.clickLogIn()
        .enterPhoneNo(phone)
        .enterPassword(password)
        .clickLogInButton()
        .verifyLoginMessage(text)
        .verifyLoginPage(title)
        .screenshot("LogInWithPhoneNo");
        
		
		
		
	}
	
}
