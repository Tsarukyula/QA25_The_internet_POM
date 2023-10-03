package org.ait.theinternet.pages.frames;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Nested Frames']")
    WebElement nestedFrame;

    public FramesPage getNestedFrames() {
        click(nestedFrame);
        return this;
    }


//    @FindBy(xpath = "//frame[@name='frame-top']")
//    WebElement frameTop;
//    @FindBy(xpath = "//frame[@name='frame-left']")
//    WebElement frameLeft;
//    @FindBy(xpath = "//frame[@name='frame-middle']")
//    WebElement frameMiddle;
//    @FindBy(xpath = "//frame[@name='frame-right']")
//    WebElement frameRight;
//    @FindBy(xpath = "//frame[@name='frame-bottom']")
//    WebElement frameBottom;
//    @FindBy(tagName = "body")
//    WebElement body;
//
//    public FramesPage switchToNestedFrames() {
//        driver.switchTo().frame(frameTop);
//        driver.switchTo().frame(frameLeft);
//        System.out.println("Iframe is " + body.getText());
//        driver.switchTo().parentFrame();
//
//        driver.switchTo().frame(frameMiddle);
//        System.out.println("Iframe is " + body.getText());
//        driver.switchTo().parentFrame();
//
//        driver.switchTo().frame(frameRight);
//        System.out.println("Iframe is " + body.getText());
//        driver.switchTo().parentFrame();
//
//        driver.switchTo().frame(frameBottom);
//        System.out.println("Iframe is " + body.getText());
//        driver.switchTo().parentFrame();
//
//        driver.switchTo().defaultContent();
//        return this;
//    }

    @FindBy(xpath = "//a[text()='iFrame']")
    WebElement iFrame;

    public FramesPage getIFrame() {
        click(iFrame);
        return this;
    }


    @FindBy(tagName = "iframe")
    List<WebElement> iframes;

    public FramesPage returnListOfFrames() {
        //using iframe tag
        System.out.println("The total numbers of iframes: " + iframes.size());
        //2. using java script
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer numberOfIframes = Integer.parseInt(js.executeScript("return window.length")
                .toString());
        System.out.println("The total numbers of iframes: " + numberOfIframes);
        return this;
    }


    @FindBy(id = "tinymce")
    WebElement contentsText;


    public FramesPage switchToIframeByIndex(int index) {
        driver.switchTo().frame(index);
        System.out.println("Text of iframe: " + contentsText.getText());
        return this;
    }
}
