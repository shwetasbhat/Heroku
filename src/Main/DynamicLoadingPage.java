package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
	
	private WebDriver driver;
	private By example2Link = By.partialLinkText("Example 2");
	
	public DynamicLoadingPage(WebDriver driver) {
		this.driver = driver ;
	}

	public Example2Page clickOnExample2() {
		driver.findElement(example2Link).click();
		return new Example2Page(driver);
	}
	
}
