package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpec;

public class FlightDetailsPage1 extends ProjectSpec{
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement clickContinue;
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement ClickContinue2;
	
	public FlightDetailsPage1(WebDriver driver) {     //constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public PassengerDetailsPage2 Continue() {
		click(clickContinue);
		return new PassengerDetailsPage2(driver);
	}
	
	public PassengerDetailsPage2 Continue2(WebDriver driver) {
		click(ClickContinue2);
		return new PassengerDetailsPage2(driver) ;
	}
	
}
