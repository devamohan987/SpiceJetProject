package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class LogInWithEmail extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		
		excelfile="LogInWithEmail";
		
	}
	
	@Test(dataProvider="getData")
	
	public void logInTestWithEmail(String email,String password ,String text,String title) throws IOException, InterruptedException {
		
		new HomePage(driver)
		.clickLogIn()
		.clickEmailCheckBox()
		.enterEmail(email)
		.enterPassword(password)
		.clickLogInButton()
		.verifyLoginMessage(text)
		.verifyLoginPage(title)
		.screenshot("LogInWithEmail");
		
		
	}
	
}
