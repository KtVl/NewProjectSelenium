package com.geekbrains.lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumStart {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://xn------dddbhryrj2a0bnp2a3n.xn--p1ai/");
        
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://xn------dddbhryrj2a0bnp2a3n.xn--p1ai/");

        chromeDriver.quit(); //закрыть браузер полностью
//        chromeDriver.close(); // закрывает текущую вкладку

    }
}
