package org.ait.theinternet.tests.horiyontalSlider;

import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.horiyontalSlider.HorizontalSliderPage;
import org.ait.theinternet.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getHorizontalSlider();
    }

    @Test
    public void sliderTest() {
        new HorizontalSliderPage(driver).moveSliderInHorizontalDirection()
                .assertSliderValue("5");
    }
}
