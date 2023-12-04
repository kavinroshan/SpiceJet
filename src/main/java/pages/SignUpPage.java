package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.ProjectSpec;

public class SignUpPage  extends ProjectSpec{
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement Title;
	
	//@FindBy(xpath="//select[@class='form-control form-select ']")
	//WebElement Title;
	//select[@class="form-control form-select"]
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dob;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement month;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement year;
	
	@FindBy(xpath="//div[text()='21']")
	WebElement date;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement phonenumber;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement conpassword;
	
	@FindBy(xpath="//label[text()='I agree to the']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitbutton;
	
	
	public SignUpPage(WebDriver driver) {             //constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SignUpPage WindowHandle() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(1));
		
		
		return this;
		
	}
	
	public SignUpPage WaitMethod() throws InterruptedException {
		
		Wait();
		return this;
	}
	


	public SignUpPage Title() {         // Title
	
		click(Title);
		Select obj = new Select(Title);
		obj.selectByVisibleText("Mr");
		return this;
	}
	
	public SignUpPage FirstName(String firstName) {    //firstname
		
		
		sendKeys(firstname, firstName);
		return this;
	}
	
	public SignUpPage LastName(String lastName) {      //lastname
		
		
		sendKeys(lastname, lastName);
		return this;
	}
	
	public SignUpPage Country() {           //country

		//click(country);
	
	Select count = new Select(country);
	count.selectByValue("IN");
	return this;
		
	}
	
	public SignUpPage DOB_Month() {
		click(dob);
		
		//click(month);
		Select obj = new Select(month);
		obj.selectByVisibleText("February");
		return this;
	}
		
	public SignUpPage DOB_Year() {
		
		Select obj = new Select(year);
	    obj.selectByVisibleText("2000");
		return this;
	}
	
	public SignUpPage DOB_Date() {
		
		click(date);
		return this;
	}
	
	public SignUpPage MobileNum(String phoneNum) {
		
		sendKeys(phonenumber, phoneNum);
		return this;
	}

	public SignUpPage Email(String mail) {
		
		sendKeys(email, mail);
		return this;
	}

	public SignUpPage Password(String pass) {
		
		sendKeys(password, pass);
		return this;
	}
	
	public SignUpPage Confirm_Password(String conpass) {
		
		sendKeys(conpassword, conpass);
		return this;
	}

	public SignUpPage TermsAndCond() {
		Actions action = new Actions(driver);
		action.moveToElement(checkbox).click(checkbox).perform();
		//click(checkbox);
		return this;
	}

	public SignUpPage Submit() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(submitbutton).click(submitbutton).perform();
			//click(submitbutton);
			System.out.println("SIGNUP SUCCESS");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return this;
	}
	
	//validation for negtive testcases
	
	
//	public SignUpPage Validation1() {
//		try {
//			String actual = driver.findElement(By.xpath("//input[@id='first_name']")).getText();
//			System.out.println(actual);
//			String expected = null;
//			Assert.assertEquals(actual, expected);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		return this;
		
	}
	
