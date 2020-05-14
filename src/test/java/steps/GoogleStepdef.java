package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStepdef {
    WebDriver driver;

    @Before
    public void began() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    }
    @After
    public void end(){
        driver.quit();
    }

    @Given("I am on the Google search page")
    public void iAmOnTheGoogleSearchPage() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("user enter {string} on search area")
    public void userEnterOnSearchArea(String arg0) throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("Cheese");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='lga']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();

    }

    @Then("the page title should start with {string}")
    public void thePageTitleShouldStartWith(String arg0) {
    }
}
