package com.geekbrains.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AfishaTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.afisha.ru/");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        driver.findElement(By.xpath("//button[.='Верно']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Событие, актер, место']")).sendKeys("брат\n");

    /* ждем пока элемент не появится
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[.='Брат']")));
     */

        driver.findElement(By.xpath("//h2[.='Брат']")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
