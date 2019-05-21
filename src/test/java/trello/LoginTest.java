package trello;

import core.BrowserFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import trello.pages.LoginPage;

import java.io.File;
import java.io.IOException;

/**
 * Created by lolik on 21.05.2019
 */
public class LoginTest extends BrowserFactory {



    @Test
    public void login() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.login("loliktestintegration@gmail.com", "pass");
        Assert.assertTrue(!driver.findElements(By.cssSelector(".mod-add")).isEmpty(), "Board page not opened");
    }



}
