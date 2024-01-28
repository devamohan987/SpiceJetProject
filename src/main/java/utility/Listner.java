package utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpecification;

public class Listner extends ProjectSpecification implements ITestListener {

	ExtentTest test;
	ExtentReports extents=SpiceJetExtendReport.getReport();

	public void onTestStart(ITestResult result) {
		
		test=extents.createTest(result.getMethod().getMethodName());
		System.out.println("Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test Passed");
		System.out.println("Test Success");
	}

	public void onTestFailure(ITestResult result) {
		
		test.fail(result.getThrowable());
		System.out.println("Test Failed");
		
		String filepath=null;
		
		try {
			filepath=screenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}

	
	

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Skipped");
	}

	
	public void onFinish(ITestContext context) {
		
		extents.flush();
		System.out.println("Test Finished");
	}
	
	
}
