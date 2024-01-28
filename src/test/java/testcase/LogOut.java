package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class LogOut extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		
		excelfile="LogOut";
		
	}
	@Test(dataProvider="getData")
    public void logoutTest(String email,String password ,String text,String title,String msg) throws InterruptedException, IOException {
				
		new HomePage(driver)
		.clickLogIn()
		.clickEmailCheckBox()
		.enterEmail(email)
		.enterPassword(password)
		.clickLogInButton()
		.verifyLoginMessage(text)
		.verifyLoginPage(title)
		.clickLogout()
		.clickUserName()
		.clickLogoutButton()
		.verifyLogoutMessage(msg)
		.screenshot("LogOut");
	}
	
}
