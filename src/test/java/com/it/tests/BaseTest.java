package com.it.tests;

import com.it.App;
import com.it.users.User;
import com.it.users.UserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    static protected App app = new App ();
    static protected User validUser = UserFactory.getValidUser();

            @AfterSuite
    public void tearDownSuite() {
       // driver.quit();
            }
}
