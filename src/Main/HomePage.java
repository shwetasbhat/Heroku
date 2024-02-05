package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class HomePage {
	
	private WebDriver driver;
	
	private By horizontalSlider = By.linkText("Horizontal Slider");
	private By contextMenuLink = By.linkText("Context Menu");
	private By framesLink = By.linkText("Frames");
	private By dynamicLoadingLink = By.linkText("Dynamic Loading");
	private By dropDownLink = By.linkText("Dropdown");
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
	
	}
	
	public HorizontalSliderPage clickHorizontalSlider() {
		driver.findElement(horizontalSlider).click();
		return (new HorizontalSliderPage(driver));
		
	}
	
	public ContextMenuPage clickContextMenuLink() {
		driver.findElement(contextMenuLink).click();
		return (new ContextMenuPage(driver));
	}

	public FramesPage clickOnFramesLink() {
		driver.findElement(framesLink).click();
		return new FramesPage(driver);
		
		
	}
	
	public DynamicLoadingPage clickOnDynamicLoadingLink() {
		driver.findElement(dynamicLoadingLink).click();
		return new DynamicLoadingPage(driver);
	}
	
	
	
	

}
