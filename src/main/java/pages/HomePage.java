package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpec;

public class HomePage extends ProjectSpec {
	
	
	@FindBy(xpath="//div[text()='Signup']")
	WebElement signUpButton;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement logInButton;
	
	@FindBy(xpath="//div[text()='Email']")
	WebElement emailCheckBox;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement ClickLogIn;
	
	@FindBy(xpath="//div[text()='one way']")    //Booking - oneway
	WebElement oneway;
	
	@FindBy(xpath="//div[text()='From']")    
	WebElement clickFrom;
	
	@FindBy(xpath="//div[text()='Delhi']")    
	WebElement selectDeparturePlace;
	
	@FindBy(xpath="//div[text()='To']")    
	WebElement clickTo;
	
	@FindBy(xpath="//div[text()='Chennai']")    
	WebElement selectDestinyPlace;
	
	@FindBy(xpath="//div[text()='Departure Date']")    
	WebElement clickDepartureDate;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[2]/div[7]")
	WebElement SelectDepartureDate;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[3]/div[2]/div/div")
	WebElement SelectReturnDate;
	
	
	@FindBy(xpath="//div[text()='Passengers']")
	WebElement ClickPassangers;
	
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement addPassangers;

	@FindBy(xpath="//div[text()='Done']")
	WebElement clickDone;
	
	@FindBy(xpath="//div[text()='Search Flight']")
	WebElement clickSearchFlight;
	
	@FindBy(xpath="//div[text()='round trip']")
	WebElement roundWay;
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkIn;
	
	
public HomePage(WebDriver driver) {              //constructor
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}

public HomePage AlertHandle() {
	try {
		Alert();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return this;
}
	
public SignUpPage ClickSignUp() {
	click(signUpButton);
	return new SignUpPage(driver);
}

public HomePage ClickLogIn() {
	click(logInButton);
	return this;
}

public HomePage ClickEmailCheckBox() {
	click(emailCheckBox);
	return this;
}

public HomePage Email(String mail) {
	sendKeys(email,mail);
	return this;
}

public HomePage Password(String pass) {
	sendKeys(password, pass);
	return this;
}

public HomePage LogIn() {
	click(ClickLogIn);
	System.out.println("LOGIN SUCCESS ");
	return this;
}

public HomePage LogIn2() throws InterruptedException {                 
	click(ClickLogIn);
	Thread.sleep(3000);
	try {
		String Actual = driver.findElement(By.xpath("//div[text()='Please enter a valid password']")).getText();
		String expected = "Please enter a valid password";
		Assert.assertEquals(Actual, expected);
		
		String Actual2= driver.findElement(By.xpath("//div[text()='Please enter a valid email address']")).getText();
		String expected2 = "Please enter a valid email address";
		System.out.println(Actual2);
		Assert.assertEquals(Actual2, expected2);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	return this;
}

//Ticket Booking

public HomePage OneWay() {             //oneway
	click(oneway); 
	return this;
}

public HomePage RoundWay() {          //roundWay
	click(roundWay);
	return this;
}

public HomePage DeparturePlace() {              //Departure
	click(clickFrom);
	return this;
}

public HomePage SelectDeparturePlace() {              //Departure
	click(selectDeparturePlace);
	return this;
}


public HomePage DestinyPlace() {
	click(selectDestinyPlace);
	return this;
}

public HomePage DepatureDate() {        //dept.date
	//click(clickDepartureDate);
	click(SelectDepartureDate);
	return this;
}

public HomePage ReturnDate() {        //return.dept.date
	click(SelectReturnDate);
	return this;
}

public HomePage Passengers() {
click(ClickPassangers);
//click(addPassangers);
return this;
}

public HomePage Passengers_Final() {
	Actions action = new Actions(driver);
	action.moveToElement(clickDone).click(clickDone).perform();
return this;
}


public FlightDetailsPage1 SearchFlight() {
	Actions action = new Actions(driver);
	action.moveToElement(clickSearchFlight).click(clickSearchFlight).perform();
	
	return new FlightDetailsPage1(driver);
	
}

//homepage functionalities

public HomePage CheckIn() {
	boolean actual = driver.findElement(By.xpath("//div[text()='check-in']")).isEnabled();
	Assert.assertEquals(actual, true);
    return this;	
}

public HomePage FlightStatus() {
	boolean actual = driver.findElement(By.xpath("//div[text()='flight status']")).isEnabled();
	Assert.assertEquals(actual, true);
    return this;	
}

public HomePage ManageBooking() {
	boolean actual = driver.findElement(By.xpath("//div[text()='manage booking']")).isEnabled();
	Assert.assertEquals(actual, true);
    return this;	
}

}
