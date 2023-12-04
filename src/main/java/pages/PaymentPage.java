package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpec;

public class PaymentPage extends ProjectSpec{
	
	
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	WebElement frame1;
	
	@FindBy(xpath="//input[@id='card_number']")
	WebElement cardnumber;
	
	@FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	WebElement frame2;
	
	@FindBy(xpath="//input[@id='name_on_card']")
	WebElement cardHolderName;
	
	@FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	WebElement frame3;
	
	
	@FindBy(xpath="//input[@id='card_exp_month']")
	WebElement expiryMonth;
	
	@FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
	WebElement frame4;
	
	@FindBy(xpath="//input[@id='card_exp_year']")
	WebElement expiryYear;
	
	@FindBy(xpath="//iframe[@class='security_code_iframe']")
	WebElement frame5;
	
	@FindBy(xpath="//input[@id='security_code']")
	WebElement cvv;
	
	@FindBy(xpath="//div[@data-testid='common-proceed-to-pay']")
	WebElement pay;
	
	@FindBy(xpath="//div[@id='payment_form_card_number_error']")
	WebElement validationtext;
	
	@FindBy(xpath="//div[text()='Invalid Card Details']")
	WebElement text;
	
	
public PaymentPage(WebDriver driver) {              //constructor
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

public PaymentPage CardNumber(String cardnum) {
	driver.switchTo().frame(frame1);
	sendKeys(cardnumber, cardnum);
	driver.switchTo().defaultContent();
	return this;
}

public PaymentPage CardHolder(String holderName) {
	driver.switchTo().frame(frame2);
	sendKeys(cardHolderName, holderName);
	driver.switchTo().defaultContent();
	return this;
}

public PaymentPage ExpiryMonth(String month) {  
	driver.switchTo().frame(frame3);
	sendKeys(expiryMonth, month);
	driver.switchTo().defaultContent();
	return this;
}

public PaymentPage ExpiryYear(String year) {  
	driver.switchTo().frame(frame4);
	sendKeys(expiryYear, year);
	driver.switchTo().defaultContent();
	return this;
}

public PaymentPage CVVnumber(String CVVnum) {  
	driver.switchTo().frame(frame5);
	sendKeys(cvv, CVVnum);
	driver.switchTo().defaultContent();
	return this;
}


public PaymentPage ProceedPayment() throws InterruptedException {
	Actions action = new Actions(driver);
	action.moveToElement(pay).click(pay).perform();
	return this;
}

public PaymentPage Validation() throws InterruptedException {
	Thread.sleep(3000);
	String expected = "Please enter a valid card";
	String actual= driver.findElement(By.xpath("//div[@id='payment_form_card_number_error']")).getText();
	//System.out.println(actual);
	Assert.assertEquals(actual, expected);
	return this;
	
}

}
