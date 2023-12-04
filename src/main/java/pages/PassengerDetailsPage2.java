package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpec;

public class PassengerDetailsPage2 extends ProjectSpec {
	
	@FindBy(xpath="//div[@data-testid='title-contact-detail-card']")
	WebElement clickTitle;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'][1]")
	WebElement selectTitle;
	
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	WebElement contactnum;
	
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement email;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-tmtnm0 r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-13qz1uu']")
	WebElement clickCountry;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement clickSearchButton;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[5]/div/div[1]/div[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div")
	WebElement selectCountry;
	
	@FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
	WebElement city;
	
	@FindBy(xpath="//div[contains(text(),'I prefer not to receive future communication')]")
	WebElement clickcheckbox;
	
	@FindBy(xpath="//div[contains(text(),'I am flying as the primary passenger')]")
	WebElement clickPrimaryPassenger;
	
	@FindBy(xpath="//div[@data-testid='traveller-0-title-field']")
	WebElement clickGenderTitle;
	
	@FindBy(xpath="//div[text()='Mr']")
	WebElement selectGenderTitle;
	
	@FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
	WebElement PassengerFirstName;
	
	@FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
	WebElement PassengerLastName;
	
	@FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
	WebElement PassengerMobileNum;
	
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement clickContinue;
	
	public PassengerDetailsPage2(WebDriver driver) {     //constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public PassengerDetailsPage2 Title() {
		click(clickTitle);
		click(selectTitle);
		return this;
	}
	
	public PassengerDetailsPage2 FirstName(String firstName) {      //ContactFirstname
		sendKeys(firstname, firstName);
		return this;
	}
	
	public PassengerDetailsPage2 LastName(String lastName) {       //lastname
		sendKeys(lastname, lastName);
		return this;
	}
	
	public PassengerDetailsPage2 ContactNumber(String contactNum) {
		sendKeys(contactnum, contactNum);
		return this;
	}
	
	public PassengerDetailsPage2 Email(String Email) {
		sendKeys(email, Email);
		return this;
	}
	
	public PassengerDetailsPage2 ClickCountry() {
		click(clickCountry);
		return this;
	}
	
	public PassengerDetailsPage2 SearchCountry(String counrty) {
		sendKeys(clickSearchButton, counrty);
		return this;
	}
	
	public PassengerDetailsPage2 SelectCountry() {
		click(selectCountry);
		return this;
	}
	
	public PassengerDetailsPage2 City(String City) {
		sendKeys(city, City);
			return this;	
		}
		

	
	public PassengerDetailsPage2 CheckBox() {
		click(clickcheckbox);
		return this;
	}
	
	public PassengerDetailsPage2 PrimaryPassenger_CheckBox() {     //passenger info
		click(clickPrimaryPassenger);
		return this;
	}
	
	public PassengerDetailsPage2 ClickGenderTitle() {
		click(clickGenderTitle);
		return this;
	}
	
	public PassengerDetailsPage2 SelectGenderTitle() {
		click(selectGenderTitle);
		return this;
	}
	
	
	public PassengerDetailsPage2 Passenger_Firstname(String Firstname) {
		sendKeys(PassengerFirstName, Firstname);
		return this;
	}
	
	public PassengerDetailsPage2 Passenger_Lastname(String Lastname) {
		sendKeys(PassengerLastName, Lastname);
		return this;
	}
	
	public PassengerDetailsPage2 Passenger_MobileNum(String mobilenum) {
		sendKeys(PassengerMobileNum, mobilenum);
		return this;
	}
	
	public AddOnPage Continue() {
		click(clickContinue);
		return new AddOnPage(driver);
	}
		
}
