package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage {

	String expectedURL = "https://www.amazon.com/";
	String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

	ChromeDriver dr;

	public void openBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "/Users/rayhan/Downloads/chromedriver");
			dr = new ChromeDriver();
			dr.get("https://www.amazon.com");
			Reporter.log("Chrome Browser Launched Successfully");

		} catch (Exception e) {
			Assert.fail("Chrome Browser Failed To Launch");
		}

	}

	public void verifyURL() {

		String actualURL = dr.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		Reporter.log("URLs matched");
	}

	public void verifyTitle() {

		String actualTtile = dr.getTitle();
		System.out.println(actualTtile);
		Assert.assertEquals(actualTtile, expectedTitle);
		Reporter.log("Titles matched");

	}

	public void search() {

	}

	public void closeBrowser() {
		
		dr.quit();
		Reporter.log("Chrome Browser Closed");

	}

}
