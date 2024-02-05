package Main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2Page {
	private WebDriver driver;
	private By startButton = By.cssSelector("#start button");
	private By finishLoading = By.id("finish");
	private By loading = By.id("loading");
	
	public Example2Page(WebDriver driver) {
		this.driver = driver;
	}

	public void clickStartButton() {
		driver.findElement(startButton).click();
	}
	
	public String verifyMessageAfterClickingStart() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
		return (driver.findElement(finishLoading).getText());
	}
}