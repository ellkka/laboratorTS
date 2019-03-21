package com.eviltester.webdrive;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\univer\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.goodreads.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        driver.findElement(By.name("user[email]")).sendKeys("mihaelatcacib@gmail.com");
        Thread.sleep(2000);  // Let the user actually see something!
        driver.findElement(By.name("user[password]")).sendKeys("good4read");
        driver.findElement(By.name("remember_me")).click();
        driver.findElement(By.name("next")).click();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
}
