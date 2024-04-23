package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo1 {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.urn.su/ui/basic_test/");

        /*WebElement searchField = ---                                проверяем поисковое окно
                driver.findElement(By.id("name1"));
        searchField.sendKeys("topbicycle.ru");
        searchField.submit();

         ----------------------------------------------------------------------------------
        WebElement renovationLink = driver.findElements(By.linkText("Renovation")).get(1); -- проверяем ссылки (get позволяет менять одинаковые значения по массивам чмисловым )
        renovationLink.click();


--------------------------------------------------------------------------------------------
        WebElement march8Link = driver.findElements(By.cssSelector("a[class=march8]")).get(1); -- проверяем по css селектору
        march8Link.click();
        */

    }
}
