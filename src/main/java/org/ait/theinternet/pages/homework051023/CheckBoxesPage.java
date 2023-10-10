package org.ait.theinternet.pages.homework051023;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxesPage extends BasePage {
    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "input[type='checkbox']:nth-child(1)")
    WebElement checkbox1;

    public CheckBoxesPage selectCheckBox1() {
        click(checkbox1);
        return this;
    }


    @FindBy(css = "input[type='checkbox']:nth-child(3)")
    WebElement checkbox2;

    public CheckBoxesPage selectCheckBox2() {
        click(checkbox2);
        return this;
    }
}
