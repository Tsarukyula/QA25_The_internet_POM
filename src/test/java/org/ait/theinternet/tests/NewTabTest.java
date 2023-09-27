package org.ait.theinternet.tests;

import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.WindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTabTest extends TestBase{

    // click on Multiple Windows Link
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getMultipleWindows();
    }


    @Test
    public void switchToNewTabTest() {
        // click on Click here link and switch to new tab
        // assert New tab

        new WindowPage(driver).switchToNewTab(1)
                .verifyNewTabTitle("New Window");
    }



}
