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

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications"); // открыть сайт без всплывающих окон
        chromeOptions.addArguments("--headless");              // запустить не открывая браузер

        WebDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://xn------dddbhryrj2a0bnp2a3n.xn--p1ai/");

        chromeDriver.quit();                                   //закрыть браузер полностью
//        chromeDriver.close();                                // закрывает текущую вкладку

    }
}
