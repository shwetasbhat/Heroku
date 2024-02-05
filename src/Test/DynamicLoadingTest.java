package Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Main.DynamicLoadingPage;
import Main.Example2Page;

public class DynamicLoadingTest extends BaseTest{
	
	@Test
	public void VerifyTextOnExample2DynamicLoading() {
		
		DynamicLoadingPage dlPage = homePage.clickOnDynamicLoadingLink();
		Example2Page ex2Page = dlPage.clickOnExample2();
		ex2Page.clickStartButton();
		String actualMessage = ex2Page.verifyMessageAfterClickingStart();
		assertEquals(actualMessage,"Hello World!");
		
		}

}
