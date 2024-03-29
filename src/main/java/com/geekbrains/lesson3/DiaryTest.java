package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

// avtotester test01
public class DiaryTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://diary.ru/user/login");
        WebElement loginForm = driver.findElement(By.id("loginform-username")); // находим поле, сохр в переменную
        loginForm.sendKeys("avtotester");                            // печатаем текст в поле

        driver.findElement(By.id("loginform-password")).sendKeys("test01"); //вводим не записывая в переменную

        // переключиться на окно айфрейма
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();

        driver.switchTo().parentFrame(); // выйти из айфрейма

        driver.findElement(By.id("login_btn")).click(); // нажать кнопку войти

        driver.findElement(By.id("writeThisDiary")).click();
        String postTitle = "Post" + new Random().nextInt(100);
        driver.findElement(By.id("postTitle")).sendKeys(postTitle);

        driver.switchTo().frame(driver.findElement(By.id("message_ifr")));
        driver.findElement(By.id("tinymce")).sendKeys("text");
        driver.switchTo().parentFrame();

        driver.findElement(By.id("rewrite")).click();

        driver.findElement(By.xpath(String.format("//a[text()='%s']", postTitle))).click();

        driver.quit();
    }
}
