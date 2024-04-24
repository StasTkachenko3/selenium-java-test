package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
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
 * Осуществляет  показ работы поисковой строки в линке "Медицинские работники".
 * Показ заголовка, который в данном тесте отсутсвует при его воспоизведении.
 * @author Stanislav Tkachenko
 * @version 1.0.0
 */
public class Test1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // разворачивает браузер на весь экран
        driver.get("https://hippocrates64.ru/"); // открывает сайт
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // ожидание отображения страницы
        WebElement renovationLink = driver.findElements(By.linkText("Медицинские работники")).get(0);
        renovationLink.click();
        WebElement searchFiled = driver.findElement(By.xpath("//*[@id=\"profile_45\"]/ul/li/a"));
        searchFiled.sendKeys("card.php?idd=45");
        searchFiled.click();
        System.out.println("Заголовок страницы - " + driver.getTitle());
        System.out.println("Страница не доступна!");

    }
}
