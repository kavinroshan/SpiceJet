package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.UtilityClass;

public class ProjectSpec extends UtilityClass {

	@Parameters({"browser", "url"})
	@BeforeMethod
	public void browserLaunch(String browser, String url) {
		 
		//launchBrowser("chrome", "https://www.demoblaze.com/");
		launchBrowser(browser, url);
	}
	
	
	@DataProvider(name= "getData")
	public String[][] getdData() throws IOException{
		String[][]	data = readExcel(excelfile);
		return data;
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		//close();
	}
}
