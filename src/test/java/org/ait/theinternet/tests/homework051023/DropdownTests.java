package org.ait.theinternet.tests.homework051023;

import org.ait.theinternet.pages.homework051023.DropdownPage;
import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDropdown();
    }

    @Test
    public void dropdownTest() {
        new DropdownPage(driver).selectDropdownOption("Option 1");
    }
}
