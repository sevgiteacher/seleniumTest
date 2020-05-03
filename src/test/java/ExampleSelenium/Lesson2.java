package ExampleSelenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class Lesson2 extends Base {

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

}
