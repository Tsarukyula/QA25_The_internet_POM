package org.ait.theinternet.tests;

import org.ait.theinternet.pages.BrokenImagesPage;
import org.ait.theinternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getBrokenImages();
    }


    @Test
    public void checkBrokenImages() {
        new BrokenImagesPage(driver).checkBrokenImages();
    }

}
