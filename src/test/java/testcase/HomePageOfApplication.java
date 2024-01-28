package testcase;

import java.io.IOException;

import base.ProjectSpecification;
import pages.HomePage;

public class HomePageOfApplication extends ProjectSpecification {

public void homePage() throws IOException {
		
		new HomePage(driver)
		.screenshot("ApplicationHomePage");
		
	}
	
}
