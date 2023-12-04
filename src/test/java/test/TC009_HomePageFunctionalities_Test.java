package test;

import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.HomePage;

public class TC009_HomePageFunctionalities_Test extends ProjectSpec {
	
	@Test
	public void HomePageFunctions_Test() {
		new HomePage(driver)
		.CheckIn()
		.FlightStatus()
		.ManageBooking();
	}

}
