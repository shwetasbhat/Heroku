package Test;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Main.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	private WebDriver driver;
	protected HomePage homePage;
	
	
	@BeforeClass
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        //Launching the browser
        driver=new ChromeDriver(opt);
		driver.get("https://the-internet.herokuapp.com");
		homePage = new HomePage(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@AfterMethod
	public void goToHomePage() {
		driver.get("https://the-internet.herokuapp.com");
	}
	
}
