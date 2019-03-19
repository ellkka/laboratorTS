package com.company;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\univer\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String temp=null;
        /**
         * Retrieve the List of Items in the Table before Sorting and Store into Array
         */
        driver.get("http://www.refurb.md/ro/search/?query=lenovo");
        List<WebElement> tdList = driver.findElements(By.className(" price"));
        List<WebElement> tzList = driver.findElements(By.className(" title"));
        String strArray[] = new String[tdList.size()];
        String stArray[] = new String[tzList.size()];
        for(int i =0;i<tdList.size();i++)
        {

            stArray[i]=tzList.get(i).getText();
            strArray[i]=tdList.get(i).getText();
        }

        for (int i = 0; i < strArray.length; i++)
        {
            for (int j = i + 1; j < strArray.length; j++)
            {
                if (strArray[i].compareTo(strArray[j])>0)
                {
                    temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }

        for (int i = 0; i < strArray.length; i++)
        {

            System.out.println(stArray[i]);
            System.out.println(strArray[i]);

        }
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();

    }
}