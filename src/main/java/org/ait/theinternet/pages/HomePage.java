package org.ait.theinternet.pages;

import org.ait.theinternet.pages.frames.FramesPage;
import org.ait.theinternet.pages.horiyontalSlider.HorizontalSliderPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='JavaScript Alerts']")
    WebElement alertsLink;
    public AlertsPage getAlerts() {
        click(alertsLink);
        return new AlertsPage(driver);
    }


    @FindBy(xpath = "//a[.='Multiple Windows']")
    WebElement windowsLink;

    public WindowPage getMultipleWindows() {
        click(windowsLink);
        return new WindowPage(driver);
    }


    @FindBy(xpath = "//a[.='Form Authentication']")
    WebElement formLink;
    public JSExecutor getFormAuthentication() {
        click(formLink);
        return new JSExecutor(driver);
    }


    @FindBy(xpath = "//a[text()='Broken Images']")
    WebElement brokenImage;

    public BrokenImagesPage getBrokenImages() {
        click(brokenImage);
        return new BrokenImagesPage(driver);
    }


    @FindBy(xpath = "//a[.='Frames']")
    WebElement frames;

    public FramesPage getFrames() {
        click(frames);
        return new FramesPage(driver);
    }


    @FindBy(xpath = "//a[text()='Horizontal Slider']")
    WebElement horizontalSlider;

    public HorizontalSliderPage getHorizontalSlider() {
        click(horizontalSlider);
        return new HorizontalSliderPage(driver);
    }
}
