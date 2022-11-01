package google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class GoogleSearchPage extends SeleniumUtility{
	//Initialize current page using page factory
	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="q")
	private WebElement searchInputField;

	public void searchText(String text) {
		typeInput(searchInputField, text);
		getActiveElementFromUI().sendKeys(Keys.ENTER);
	}
}
