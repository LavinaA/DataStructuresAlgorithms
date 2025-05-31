package com.dsAlgo.DesignPatterns.Singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SingletonDesignTest {
    WebDriver driver1;
    WebDriver driver2;

    @BeforeClass

    public static void setUp() {
        SingletonBaseClass.init();
    }

    @Test
    public void verifyBStackDemoTitle() {
        driver1 = SingletonBaseClass.getDriver();
        System.out.println("driver1: " + driver1);
        driver1.get("https://bstackdemo.com/");
        Assert.assertEquals(driver1.getTitle(), "StackDemo");
    }

    @Test
    public void verifyBStackDemoLogo() {
        driver2 = SingletonBaseClass.getDriver();
        System.out.println("driver2: " + driver2);
        driver2.get("https://bstackdemo.com/");
        WebElement logo = driver2.findElement(By.cssSelector(" a.Navbar_logo__26S5Y"));
        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(logo.isDisplayed());
    }

    @AfterClass
    public static void tearDown() {
        SingletonBaseClass.quit();
    }

}