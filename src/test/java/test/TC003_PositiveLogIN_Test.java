package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.HomePage;

public class TC003_PositiveLogIN_Test extends ProjectSpec{
	
	@BeforeTest
	public void setup() {
		excelfile="Positive_LogIn_TestCase";
	}

	@Test (dataProvider = "getData")
	
	public void LogInTest(String email, String password) {
		new HomePage(driver)
		.ClickLogIn()
		.ClickEmailCheckBox()
		.Email(email)
		.Password(password)
		.LogIn();
	}
}
