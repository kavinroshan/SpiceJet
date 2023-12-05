package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.HomePage;

public class TC001_Positive_SignUp_Test extends ProjectSpec {

	@BeforeTest
	public void setup () {
		excelfile="Positive_SignUp_TestCase";
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
		//.TermsAndCond()
		.Submit();
}
}

//String firsname, String lastname, String phoneNumber, String mail, String pass, String conpss