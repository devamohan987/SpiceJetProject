package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.BaseUtility;

public class ProjectSpecification extends BaseUtility {

@Parameters({"url","browser"})
	
	@BeforeMethod
    public void browserLaunch(String url,String browser) throws InterruptedException{
    	   launchBroswer(url, browser);
       }
	
			
	@DataProvider(name="getData")
	public String[][]getData()throws IOException{
		String[][] data=readExcel(excelfile);
		return data;
	}
	
     @AfterMethod    
          public void closeBrowser() {
        	   close();
           }
     
}
