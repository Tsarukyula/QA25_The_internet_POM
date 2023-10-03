package org.ait.theinternet.pages.horiyontalSlider;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage {
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='range']")
    WebElement sliderContainer;

    public HorizontalSliderPage moveSliderInHorizontalDirection() {
        pause(1000);
        new Actions(driver).dragAndDropBy(sliderContainer, 65, 0).perform();
        return this;
    }


    @FindBy(id = "range")
    WebElement range;

//    public HorizontalSliderPage assertSliderValue(String number) {
//        Assert.assertEquals(getValueAttribute(sliderValue, "value"), number);
//        return this;
//    }
//
//    public String getValueAttribute(WebElement element, String name) {
//        return element.getAttribute(name);
//    }

    public HorizontalSliderPage assertSliderValue(String text) {
        Assert.assertEquals(range.getText(), text);
        return this;
    }

}
