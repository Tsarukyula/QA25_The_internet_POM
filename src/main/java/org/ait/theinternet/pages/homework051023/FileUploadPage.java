package org.ait.theinternet.pages.homework051023;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {

        super(driver);
    }


    @FindBy(id = "file-upload")
    WebElement fileUpload;

    @FindBy(id = "file-submit")
    WebElement fileSubmit;


    public FileUploadPage uploadFile(String photoPath) {
        fileUpload.sendKeys(photoPath);
        click(fileSubmit);
        return this;
    }


    @FindBy(id = "uploaded-files")
    WebElement uploadedFiles;

    public void assertUploadedFile(String fileName) {
        String uploadedFile = uploadedFiles.getText();
        Assert.assertEquals(uploadedFile, fileName);
    }

}
