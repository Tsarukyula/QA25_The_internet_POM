package org.ait.theinternet.tests.homework051023;

import org.ait.theinternet.pages.homework051023.FileUploadPage;
import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.tests.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getFileUpload();
    }

    @Test
    public void FileUploadTest() {
        String filePath = "C:/Users/AIT TR Student/Desktop/1.jpg";
        new FileUploadPage(driver).uploadFile(filePath);
    }

    @Test
    public void FileUploadWithoutButtonTest() {
        String filePath = "C:/Users/AIT TR Student/Desktop/1.jpg";
        new FileUploadPage(driver).uploadFileWithoutButton(filePath);
    }
}
