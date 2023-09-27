package org.ait.theinternet.tests;

import org.ait.theinternet.data.UserData;
import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.JSExecutor;
import org.testng.annotations.Test;

public class JSExecutorTests extends TestBase {

    @Test
    public void jsExecutorTest() {
        new HomePage(driver).getFormAuthentication();
        new JSExecutor(driver)
                .enterDataWithJSE(UserData.USER_NAME, UserData.USER_PASSWORD)
                .clickOnLoginButtonWithJSE()
                .checkURLWithJSE();
    }

}
