package ExampleSelenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class Lesson1 extends Base {

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("Sevgi");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Yalcin");
        Thread.sleep(2000);
        driver.findElement(By.id("sex-1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("exp-3")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("datepicker")).sendKeys("19.03.2000");
        Thread.sleep(2000);
        driver.findElement(By.id("profession-1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("tool-2")).click();
        Thread.sleep(2000);
        driver.quit();
    }


}
