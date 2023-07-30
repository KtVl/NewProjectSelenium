package com.geekbrains.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class DiaryCookie {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://diary.ru");

        Cookie cookie = new Cookie("_identity_", "d52174a28d32798a97d4a7b01384d16dbf8e53fd231f3bbed6ca854ed5091db8a%3A2%3A%7Bi%3A0%3Bs%3A10%3A%22_identity_%22%3Bi%3A1%3Bs%3A52%3A%22%5B3585397%2C%22iOF8jFg-I9EAOpjxbZzcdMgLVEk1591e%22%2C2592000%5D%22%3B%7D");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();                  // обновить страницу
        //driver.manage().getCookieNamed("_identity_"); // удалить куку

        driver.findElement(By.id("writeThisDiary")).click();
        String postTitle = "Post" + new Random().nextInt(100);
        driver.findElement(By.id("postTitle")).sendKeys(postTitle);

        driver.switchTo().frame(driver.findElement(By.id("message_ifr")));
        driver.findElement(By.id("tinymce")).sendKeys("text");
        driver.switchTo().parentFrame();

        driver.findElement(By.id("rewrite")).click();

        //найти пост на странице используя фильтр по тексту
        List<WebElement> postTitles = driver.findElements(By.xpath("//a[@class='title']"));
        postTitles.stream().filter(p -> p.getText().equals(postTitle)).findFirst().get();

        Thread.sleep(3000);
        driver.quit();
    }
}
