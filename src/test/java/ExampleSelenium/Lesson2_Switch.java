package ExampleSelenium;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class Lesson2_Switch extends Base {


    @Test
    public void IFAndSwichWindowExample() throws Exception {
/**
 * without Parent handle definition
 */
        driver.get("https://demoqa.com/iframe-practice-page/");
        driver.manage().window().maximize();
        driver.switchTo().frame("IF1");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='you-tube']")).click();
        Thread.sleep(3000);

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        //driver.findElement(By.xpath("//a[contains(text(),'Sortable')]")).click();
        driver.findElement(By.xpath("//a[@title='Cucumber in Java - Class 8']")).click();
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test
    public void IFrameExample() throws Exception {
/**
 * without Parent handle definition
 */
        driver.get("https://demoqa.com/iframe-practice-page/");
        driver.manage().window().maximize();
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Handle:: " + parentHandle);

        driver.switchTo().frame("IF1");
        driver.findElement(By.xpath("//a[@class='you-tube']")).click();
        System.out.println("driver handle::" + driver.getWindowHandle());
        Thread.sleep(2000);

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        if (driver.getWindowHandle() != parentHandle) {
            driver.switchTo().window(parentHandle);
            driver.findElement(By.xpath("//a[contains(text(),'Sortable')]")).click();
            Thread.sleep(2000);
        }
        driver.switchTo().window(tabs2.get(1));
        driver.close();

    }

    }
