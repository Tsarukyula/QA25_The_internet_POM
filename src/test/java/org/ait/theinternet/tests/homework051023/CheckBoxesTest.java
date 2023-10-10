package org.ait.theinternet.tests.homework051023;

import org.ait.theinternet.pages.homework051023.CheckBoxesPage;
import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxesTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getCheckBoxes();
    }


    @Test
    public void selectCheckBox1() {
        new CheckBoxesPage(driver).selectCheckBox1();
    }

    @Test
    public void selectCheckBox2() {
        new CheckBoxesPage(driver).selectCheckBox2();
    }

}
