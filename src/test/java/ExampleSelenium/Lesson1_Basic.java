package ExampleSelenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class Lesson1_Basic extends Base {

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


    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.thecollege.co.uk/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='psm-icon psm-group']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='What to Study']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Subject Areas']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h6//a[text()='Music']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='See our Music courses!']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        Thread.sleep(3000);

    }

    @Test
    public void test3() throws InterruptedException {

        driver.get("https://www.wokingham.gov.uk/libraries/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Our reading schemes']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Find out about Bookstart for children']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Bookstart website']")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@class='text-align-center']//a[@href='/what-we-do/programmes-and-campaigns/bookstart/families/']")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='navigation-item']//a[@class='navigation-link']")).click();
        Thread.sleep(2000);
    }

    @Test
    public void linkTest() throws InterruptedException {
        driver.get("http://facebook.com");
        driver.findElement(By.linkText("Help")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Help")).click();

    }


}
