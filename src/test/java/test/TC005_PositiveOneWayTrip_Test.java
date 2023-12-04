package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.HomePage;

public class TC005_PositiveOneWayTrip_Test extends ProjectSpec {

 @BeforeTest
 public void setup() {
	 excelfile="Positive_OneWayTicket_TestCase";
 }
	
	@Test (dataProvider = "getData")
	
	public void OneWayTrip_Test(String firstname, String lastname,String contactNum, String mail, String country,String city, String cardnum, String holdername, String expirymonth, String expiryyear, String cvv) throws InterruptedException {
		new HomePage(driver)
		.OneWay()
		.DeparturePlace()
		.SelectDeparturePlace()
		.DestinyPlace()
		.DepatureDate()
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
//		.ClickGenderTitle()
//		.SelectGenderTitle()
//		.Passenger_Firstname(FirstName)
//		.Passenger_Lastname(LastName)
//		.Passenger_MobileNum(number)
		.Continue()
		.ContinuePay()
		.SkipAd()
		.CardNumber(cardnum)
		.CardHolder(holdername)
		.ExpiryMonth(expirymonth)
		.ExpiryMonth(expiryyear)
		.CVVnumber(cvv)
		.ProceedPayment()
		.Validation();
	}
}
