package org.ait.theinternet.pages.homework051023;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "file-upload")
    WebElement fileUpload;

    public FileUploadPage uploadFile(String photoPath) {
        fileUpload.sendKeys(photoPath);
        return this;
    }

    @FindBy(id = "drag-drop-upload")
    WebElement dragUndDropUpload;

    public FileUploadPage uploadFileWithoutButton(String filePath) {
        Actions actions = new Actions(driver);
        actions.moveToElement(dragUndDropUpload).build().perform();
        dragUndDropUpload.sendKeys(filePath);

        return this;
    }
}
