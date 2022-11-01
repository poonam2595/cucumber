package google.pagesctips;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import google.pages.GoogleSearchPage;
import utilities.SeleniumUtility;

public class TestGoogleSearch extends SeleniumUtility{

	GoogleSearchPage getGoogleSearchPage;
	@BeforeTest
	public void preCondition() {
		WebDriver driver=setUp("chrome", "https://www.google.com");
		getGoogleSearchPage=new GoogleSearchPage(driver);
	}
	@Test
	public void testSearchPage() {		
		getGoogleSearchPage.searchText("Selenium interview questions");
		Assert.assertTrue(getCurrentTitleOfApplication().contains("Selenium interview questions"), "Google search was not sucessfull");
	}	
	@AfterTest
	public void teardown() {
		cleanUp();
	}
}
