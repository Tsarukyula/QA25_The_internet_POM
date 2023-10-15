package org.ait.theinternet.tests.frames;

import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.frames.FramesPage;
import org.ait.theinternet.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getFrames();
    }


    @Test
    public void switchToNestedFramesTest() {
        new FramesPage(driver)
                .getNestedFrames();
    }


    @Test
    public void returnListOfFramesTest() {
        new FramesPage(driver)
                .getIFrame()
                .returnListOfFrames();
    }


    @Test
    public void switchToIframeByIndexTest() {
        new FramesPage(driver)
                .getIFrame()
                .switchToIframeByIndex(0);
    }

}
