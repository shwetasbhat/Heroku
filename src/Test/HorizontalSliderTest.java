package Test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import Main.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTest {
	

@Test
public void testHorizontalSliderForrightArrows() {
		HorizontalSliderPage hsPage = homePage.clickHorizontalSlider();
		hsPage.slideRightArrows(3);
		String actualValue = hsPage.getRangeValue();
		assertEquals(actualValue, "1.5");
		
	}

}
