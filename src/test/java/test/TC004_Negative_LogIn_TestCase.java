package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.HomePage;

public class TC004_Negative_LogIn_TestCase extends ProjectSpec{

	@BeforeTest
	public void setup() {
		excelfile="Negative_LogIn_TestCase";
	}

	@Test (dataProvider = "getData")
	
	public void LogInTest(String email, String password) throws InterruptedException {
		new HomePage(driver)
		.ClickLogIn()
		.ClickEmailCheckBox()
		.Email(email)
		.Password(password)
		.LogIn2();
	}
	
}
