package com.qamate.orangehrm_selenium_automation.Tests;

import in.mayurshah.base.BaseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.List;

/**
 * Created by mayur on 20-10-2016.
 */
public class GoogleTest extends BaseActions {
    @Test
    public void searchTest() throws InterruptedException {
        this.testCase.addTestSteps("Home page opens.","User should see google.com","User can see google.com",true);
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!\n"); // send also a "\n"
        this.testCase.addTestSteps("Search result page verification","User should see search result page","User can see search result",true);
        element.submit();

        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

        List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));

        for (WebElement webElement : findElements)
        {
            System.out.println(webElement.getAttribute("href"));
            Thread.sleep(1000);
        }
        this.testCase.addTestSteps("Search result verification","All search result should be printed on console","Search result was printed on the console.",true);

    }
}
