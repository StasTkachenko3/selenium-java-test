package org.testing;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 /*
       ______     __
      / ____/__  / /__  ____  (_)_  ______ ___
      \__ \/ _ \/ / _ \/ __ \/ / / / / __ `__ \
    ___/ /  __/ /  __/ / / / / /_/ / / / / / /
    /____/\___/_/\___/_/ /_/_/\__,_/_/ /_/ /_/
    ------------------------------------------

 */

/**
 * Класс представляет собой автотест функциональности веб-страницы.
 * Осуществляет  показ регистрации нового пользователя.
 * Подтверждение успешной регистрации.
 * Вход пользователя.
 * Проверка успешного входа.
 * @author Stanislav Tkachenko
 * @version 1.0.0
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hippocrates64.ru/");
        // Регистрация нового пользователя
        driver.findElement(By.linkText("Регистрация")).click();
        driver.findElement(By.name("name")).sendKeys("STask");
        driver.findElement(By.name("email")).sendKeys("Stask@example.com");
        driver.findElement(By.name("password")).sendKeys("password123");
        driver.findElement(By.name("confirm")).sendKeys("password123");
        driver.findElement(By.name("phone")).sendKeys("123456789");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Подтверждение успешной регистрации
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='success-message']"));
        Assert.assertTrue("Registration success message is not displayed", successMessage.isDisplayed());

        // Вход пользователя
        driver.findElement(By.linkText("Вход")).click();
        driver.findElement(By.id("email")).sendKeys("Stask@example.com");
        driver.findElement(By.id("password")).sendKeys("password123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Проверка успешного входа
        WebElement userWelcomeMessage = driver.findElement(By.xpath("//div[@class='user-welcome']"));
        Assert.assertTrue("User welcome message is not displayed", userWelcomeMessage.isDisplayed());

        // Проверка функционала личного кабинета
        driver.findElement(By.linkText("Личный кабинет")).click();


    }

}

