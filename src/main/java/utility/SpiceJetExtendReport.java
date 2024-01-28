package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SpiceJetExtendReport {

	public static ExtentReports getReport() {
	 	   ExtentSparkReporter report=new ExtentSparkReporter("./reportspicejet/report.html");
	 	   report.config().setReportName("SpiceJet Reporter");
	 	   report.config().setDocumentTitle("SpiceJet Reporter Title");
	 	   ExtentReports extent=new ExtentReports();
	 	   extent.attachReporter(report);
	 	   
	 	   return extent;
	 	   
	 	   }
	
}
