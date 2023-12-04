package utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpec;



public class Listner extends ProjectSpec implements ITestListener {
	
	ExtentTest test;
	ExtentReports extents = ExtentReportSpiceJet.getReport();
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extents.createTest(result.getMethod().getMethodName());
		System.out.println("Started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test passed");
		System.out.println("success");
		
String filepath = null;
		
	    try {
			filepath = getScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}
		
		
	
	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		System.out.println("Failed");
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped");
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extents.flush();
		System.out.println("Finished");
		
	}
}


