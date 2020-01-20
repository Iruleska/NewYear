package com.it.tests;
import com.it.pages.DashboardPage;
import com.it.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class MyTest extends BaseTest{

    @Test
    public void test4() {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getlbUser(), validUser.email);

    }
}









