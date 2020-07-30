package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPage;

public class AmazonTest {
	
	@Test
	public void amzTest() {
		
		HomePage home = new HomePage ();
		
		home.openBrowser();
		home.verifyURL();
		home.verifyTitle();
		home.search();
		
		ProductPage prod = new ProductPage();
		
		prod.clickItem();
		home.closeBrowser();
		
	
	}
	

}
