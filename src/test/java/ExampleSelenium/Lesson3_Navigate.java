package ExampleSelenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class Lesson3_Navigate extends Base{

    @Test
    public void navigateTest() throws InterruptedException {
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        String pageTitle;
        String currentUrl;
        String urlToNavigate = "https://www.facebook.com/login/";

        pageTitle = driver.getTitle();
        currentUrl = driver.getCurrentUrl();
        System.out.println("Title of the page: " + pageTitle);
        System.out.println("URL of the page: " + currentUrl);
        Thread.sleep(3000);

        driver.navigate().to(urlToNavigate);
        pageTitle = driver.getTitle();
        currentUrl = driver.getCurrentUrl();
        System.out.println("Title of the page: " + pageTitle);
        System.out.println("URL navigated:" + currentUrl);
        Thread.sleep(3000);

        driver.navigate().back();
        pageTitle = driver.getTitle();
        currentUrl = driver.getCurrentUrl();
        System.out.println("Title of the page after BACK navigation: " + pageTitle);
        System.out.println("URL navigated:" + currentUrl);
        Thread.sleep(3000);

        driver.navigate().forward();
        pageTitle = driver.getTitle();
        currentUrl = driver.getCurrentUrl();
        System.out.println("Title of the page after FORWARD navigation: " + pageTitle);
        System.out.println("URL navigated:" + currentUrl);
        driver.findElement(By.id("email")).sendKeys("e@e.com");
        Thread.sleep(3000);

        System.out.println("Refresh Page......");
        //First way
        driver.navigate().refresh();
        //Second way
        driver.get(currentUrl);
        //Third way
        driver.navigate().to(currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("Page Source \n" + pageSource);





    }
}

