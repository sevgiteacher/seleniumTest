package ExampleSelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Lesson4_Wait extends Base {

    @Test
    public void waitExamples() throws InterruptedException {
        String text;
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Techlistic"+ Keys.ENTER);
        Thread.sleep(1000);
        text= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='result-stats']"))).getText();
        System.out.println(text);

        List<WebElement> result = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
        result.get(0).click();
        Thread.sleep(1000);
///



    }

}
