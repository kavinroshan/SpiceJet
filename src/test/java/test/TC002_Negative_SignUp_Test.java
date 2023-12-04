package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.HomePage;

public class TC002_Negative_SignUp_Test extends ProjectSpec {
	
	@BeforeTest
	public void setup () {
		excelfile="Book1";
	}
	
	@Test (dataProvider = "getData")
	public void signUpTest(String firstname, String lastname, String phonenum, String email, String password, String confirmPass ) throws InterruptedException {
		new HomePage(driver)
		.ClickSignUp()
		.WindowHandle()
		.Title()
		.FirstName(firstname)
		.LastName(lastname)
		.Country()
		.DOB_Month()
		.DOB_Year()
		.DOB_Date()
		.MobileNum(phonenum)
		.WaitMethod()
		.Email(email)
		.Password(password)
		.Confirm_Password(confirmPass)
		.Submit();
		

}
	}
	
