package ExampleSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson3{
    private final String Chrome = "/Users/math/Desktop/Testing/chromedriver";
    WebDriver driver;

    @Before
    public void began(){
        System.setProperty("webdriver.chrome.driver",Chrome);
        driver = new ChromeDriver();
    }
    @After
    public void end(){
        driver.quit();
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
}

