package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {
	
	private WebDriver driver;
//	private WebElement topFrame = driver.findElement(By.name("frame-top"));
//	private WebElement leftFrame = driver.findElement(By.name("frame-left"));
	private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
	private String bottomFrame = "frame-bottom";
	private By body = By.tagName("body");
	
	public NestedFramesPage(WebDriver driver) {
		
		this.driver = driver;
		}
	
	public String getTextFromLeftFrame() {
		driver.switchTo().frame(topFrame);
		driver.switchTo().frame(leftFrame);
		String leftFrameText = driver.findElement(body).getText();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		return (leftFrameText);
		
	}
	
	public String getTextFromBottomFrame() {
		driver.switchTo().frame(bottomFrame);
		String bottomFrameText = driver.findElement(body).getText();
		driver.switchTo().parentFrame();
		return(bottomFrameText);
		
	}
}