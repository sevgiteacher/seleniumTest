import ExampleSelenium.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    private final String chrome = "/Users/math/Desktop/Testing/chromedriver";
    WebDriver driver;

//    @Before
    public void began(){
        System.setProperty("webdriver.chrome.driver",chrome);
        driver = new ChromeDriver();
    }
 //   @After
    public void end(){
        driver.quit();
    }

    @Given("User views Practice Form page")
    public void userViewsPracticeFormPage() {
        System.setProperty("webdriver.chrome.driver",chrome);
        driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
    }

    @When("User enter Sevgi on Firstname area")
    public void userEnterSevgiOnFirstnameArea() throws InterruptedException {
        driver.findElement(By.name("firstname")).sendKeys("Sevgi");
        Thread.sleep(2000);
    }

    @And("User enter Yalcin on Lastname area")
    public void userEnterYalcinOnLastnameArea() throws InterruptedException {
        driver.findElement(By.name("lastname")).sendKeys("Yalcin");
        Thread.sleep(2000);
    }

    @And("User click Female")
    public void userClickFemale() throws InterruptedException {
        driver.findElement(By.id("sex-1")).click();
        Thread.sleep(2000);
    }

    @And("User click Experience_four")
    public void userClickExperience_four() throws InterruptedException {
        driver.findElement(By.id("exp-3")).click();
        Thread.sleep(2000);
    }

    @And("User enter {string} on DatePicker area")
    public void userEnterOnDatePickerArea(String arg0) throws InterruptedException {
        driver.findElement(By.id("datepicker")).sendKeys("19.03.2000");
        Thread.sleep(2000);
    }

    @And("User click Automation_Tester button")
    public void userClickAutomation_TesterButton() throws InterruptedException {
        driver.findElement(By.id("profession-1")).click();
        Thread.sleep(2000);
    }

    @And("User click Selenium_WebDriver button")
    public void userClickSelenium_WebDriverButton() throws InterruptedException {
        driver.findElement(By.id("tool-2")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
