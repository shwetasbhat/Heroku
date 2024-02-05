package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class HorizontalSliderPage{
	
	private WebDriver driver;
	By slider = By.cssSelector("div.sliderContainer input");
	By rangeValue = By.cssSelector("div.sliderContainer #range");
	
	
	public HorizontalSliderPage(WebDriver driver) {
		this.driver = driver ;
	}
	

	
	
	public String getRangeValue() {
		
		return(driver.findElement(rangeValue).getText());
	}


	public void slideRightArrows(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i <n; i++) {
			driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
		}
	}
}
