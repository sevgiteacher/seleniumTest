package ExampleSelenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    private final String chrome = "/Users/math/Desktop/Testing/chromedriver";
    WebDriver driver;

    @Before
    public void began(){
        System.setProperty("webdriver.chrome.driver",chrome);
        driver = new ChromeDriver();
    }
    @After
    public void end(){
        driver.quit();
    }

}

