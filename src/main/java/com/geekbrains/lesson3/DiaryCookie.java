package com.geekbrains.lesson3;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiaryCookie {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://diary.ru");

        Cookie cookie = new Cookie("_identity_", "eyJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJnZWVrYnJhaW5zIiwiaWF0IjoxNjg0OTMwNzc2LCJhdWQiOlsiYWNjZXNzIl0sInVzZXJfaWQiOjc4ODg3NTAsInVzZXJfdXVpZCI6Ijg0MTE2NWY3LWVmZDktNDU4OS1iZmRlLTk1MjE5NjE1ZWI0OSIsInVwZiI6IndpbmRvd3MiLCJleHAiOjE2ODc1MjI3NzYsImF1dGhlbnRpY2F0YWJsZV9zYWx0IjoiJDJhJDExJHFEUzh0N1d3NDhtT0duY3MzSEQvQS4iLCJyb2xlcyI6WyJ1c2VyIl19.UoYMUNIxmGwBOBUezzgN9_loS9HoazIIGLJhW8PsWJZoueyQROqt7J_ao4lJtiPS2FkXYbaLplVlNq57MZQkn0fff_eUQBtyMI2qAA3JxPLYHaZQ0nUqjqQZsLzd1TbFjN-tlGDRlyJ7ae0FMF9vUx6ay2sDWOpAvzaMNCts51HZe3qQ1YqsHNdgwREq0uqQlny0z3YH1e52A0VKKeESXY8BPlDSPaI8d3O6C81G3nxycYioTVmEmEVQaSka7b0Nbq5B1BYu_BuAE-mXhq_CF5RU4tT4cHrp0Ks152C-31Eglf5twjXlR9wElpOAWdj6OfaMS3PEfWiA0NYeSxNrAQ");
        driver.manage().addCookie(cookie);            // добавить куку
        driver.navigate().refresh();                  // обновить страницу
        driver.manage().getCookieNamed("_identity_"); // удалить куку
        driver.quit();

    }
}
