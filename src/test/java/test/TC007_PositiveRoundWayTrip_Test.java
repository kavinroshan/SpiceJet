package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.HomePage;

public class TC007_PositiveRoundWayTrip_Test extends ProjectSpec{

	@BeforeTest
	 public void setup() {
		 excelfile="Positive_Roundway_Testcase";
	 }
		
		@Test (dataProvider = "getData")
		
		public void RoundWayTrip_Test(String firstname, String lastname,String contactNum, String mail, String country,String city, String cardnum, String holdername, String expirymonth, String expiryyear,String cvv) throws InterruptedException {
			
			new HomePage(driver)
			.RoundWay()
			.DeparturePlace()
			.SelectDeparturePlace()
			.DestinyPlace()
			.DepatureDate()
			.ReturnDate()
			.Passengers()
			.Passengers_Final()
			.SearchFlight()
			.Continue()
			.Title()
			.FirstName(firstname)
			.LastName(lastname)
			.ContactNumber(contactNum)
			.Email(mail)
			.ClickCountry()
			.SearchCountry(country)
			.SelectCountry()
			.City(city)
			.CheckBox()
			.PrimaryPassenger_CheckBox()
			.Continue()
			.ContinuePay()
			.SkipAd()
			.CardNumber(cardnum)
			.CardHolder(holdername)
			.ExpiryMonth(expirymonth)
			.ExpiryYear(expiryyear)
			.CVVnumber(cvv)
			.ProceedPayment()
			.Validation();
		
		}
}
