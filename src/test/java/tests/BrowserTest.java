package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
    WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/math/Desktop/Testing/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
//      driver.close();
    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println("title: "+ title);
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("selenium test");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("se@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("1234");
        Thread.sleep(2000);
        driver.findElement(By.id("u_0_b")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Sevgi");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Yalcin");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("avg@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("u_0_u")).sendKeys("avg@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("u_0_w")).sendKeys("1298");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='day' ]//option[@value='3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='month' ]//option[@value='1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='year' ]//option[@value='2001']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("u_0_6")).click();
        Thread.sleep(3000);


    }


}
