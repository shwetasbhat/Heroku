package Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Main.FramesPage;
import Main.NestedFramesPage;

public class FramesTest extends BaseTest {

	
	private NestedFramesPage extracted() {
		FramesPage framesPage = homePage.clickOnFramesLink();
		NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();
		return nestedFramesPage;
		
	}
	
	@Test
	public void verifyTextInLeftFrame() {
		NestedFramesPage nestedFramesPage = extracted();
		String actualMessage = nestedFramesPage.getTextFromLeftFrame();
		assertEquals(actualMessage,"LEFT");
	}
	
    @Test
	public void verifyTextInBottomFrame() {
    	NestedFramesPage nestedFramesPage = extracted();
    	String actualMessage = nestedFramesPage.getTextFromBottomFrame();
    	assertEquals(actualMessage,"BOTTOM");
	}
}
