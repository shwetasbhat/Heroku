package Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Main.ContextMenuPage;

public class ContextMenuTest extends BaseTest {
	
	@Test
	public void testAlertMessageOnContextClick() {
		
		ContextMenuPage contextMenuPage = homePage.clickContextMenuLink();
		contextMenuPage.clickInTheBox();
		String actualMessage = contextMenuPage.getMessageOnAlert();
		contextMenuPage.selectOkOnAlert();
		assertEquals(actualMessage,"You selected a context menu");
	}
	

}
