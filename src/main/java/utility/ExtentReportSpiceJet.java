package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.ProjectSpec;

public class ExtentReportSpiceJet extends ProjectSpec{
	
public static ExtentReports getReport() {
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/report.html");
		reporter.config().setReportName("SpiceJetReport");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;

}
}