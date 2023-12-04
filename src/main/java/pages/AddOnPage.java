package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpec;

public class AddOnPage extends ProjectSpec{
	
	@FindBy(xpath="//div[@data-flk-success='atNodeInserted319'][3]")
	WebElement clickContinue;
	
	@FindBy(xpath="(//div[text()=\"Continue\"])[3]")
	WebElement Continue2;
	
	@FindBy(xpath="//span[text()='Skip this to skip comfort.']")
	WebElement skipAd;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/img")
	WebElement clickDismiss;
	
public AddOnPage(WebDriver driver) {              //constructor
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}

public AddOnPage DismissAd() throws InterruptedException {
	
	Thread.sleep(5000);
	try {
		click(clickDismiss);
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	return this;
	
}
	

public AddOnPage ContinuePay() {
	Actions action = new Actions(driver) ;
    action.moveToElement(Continue2).click(Continue2).perform();
	//click(Continue2);
	return this;
}

public PaymentPage SkipAd() throws InterruptedException {
	Thread.sleep(5000);
	Actions act = new Actions(driver);
	act.moveToElement(skipAd).click(skipAd).perform();
	//click(skipAd);
	return new PaymentPage(driver);
}

}
