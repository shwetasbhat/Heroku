package Main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
	
	private WebDriver driver;
	private By contextClickBox = By.id("hot-spot");
	
	public ContextMenuPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void clickInTheBox() {
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(contextClickBox)).build().perform();
	}
	
	public void selectOkOnAlert() {
		
		driver.switchTo().alert().accept();
	}
	
	public String getMessageOnAlert() {
		
		return(driver.switchTo().alert().getText());
	}
	
}
