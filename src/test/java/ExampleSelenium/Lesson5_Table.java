package ExampleSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class Lesson5_Table {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");

    }

    @After
    public void end() {
        driver.quit();
    }

    @Test
    public void printTable() throws InterruptedException {
        WebElement table = driver.findElement(By.id("example"));
        String wholeTable = table.getText();
        //verify that Nixon is in the table.
        assertTrue(wholeTable.contains("Nixon"));
        Thread.sleep(2000);
    }

    @Test
    public void Test_1() {
        //number of column
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='example']//th"));
        System.out.println("Number of columns:: " + headers.size());
        for (WebElement header : headers) {
            System.out.println("Name of header:: " + header.getText());
        }

        //number of rows with heather
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']//tr"));
        System.out.println("Number of rows with heather::: " + rows.size());

        //number of rows without heather
        List<WebElement> rowss = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        System.out.println("Number of rows without heather:: " + rowss.size());

    }


    @Test
    public void getRow() {
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        for (int i = 1; i <= allRows.size(); i++) {
            String rowXpath = "//table[@id='example']/tbody/tr[" + i + "]";
            System.out.println("rowPath :: " + rowXpath);
            WebElement singleRow = driver.findElement(By.xpath(rowXpath));
            System.out.println(singleRow.getText());

        }
    }

    @Test
    public void getAllCellsInRow(){
        List<WebElement> allCellsInOneRow = driver.findElements(By.xpath("//table[@id='example']/tbody/tr[1]/td"));
        for (WebElement cell : allCellsInOneRow) {
            System.out.println(cell.getText());
        }
    }

    @Test
    public void getSingleCellByIndex(){
        WebElement singleCell = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[3]/td[2]"));
        System.out.println(singleCell.getText());
    }

    @Test
    public void printAllCellByIndex(){
        //number of rows
        int rowNumber = getNumberOfRows();
        //number of columns
        int colNumber = getNumberOfColumns();
        //iterate through each row in the table
        for (int i = 1; i <=rowNumber; i++) {
            //iterate through each cell in the table
            for (int j = 1; j <= colNumber ; j++) {
                //creating dynamic xpath
                String xpath = "//table[@id='example']/tbody/tr["+ i +"]/td["+ j +"]";
                //System.out.println(xpath);
                //getting each cell value and printing it
                WebElement singleCell = driver.findElement(By.xpath(xpath));
                System.out.println(singleCell.getText());
            }
        }
    }

    @Test
    public void calculateAvarageAge() {
        int totalAge = 0,  age = 0,   avarageAge = 0;
       int rowNumber = getNumberOfRows();
       for (int i=1; i<=rowNumber; i++){
           String xpath = "//table[@id='example']/tbody/tr[" + i + "]/td[4]";
           WebElement singleCell = driver.findElement(By.xpath(xpath));
           age= Integer.parseInt(singleCell.getText());
           totalAge = totalAge + age;
       }
       avarageAge = totalAge /rowNumber;
           System.out.println("totalAge = " + totalAge);
           System.out.println("avarageAge = " + avarageAge);
    }


    @Test
    public void calculateAvarageSalary(){
        int totalSalary=0, salary=0, avarageSalary=0;
        int rowNumber = getNumberOfRows();
        for (int i=1; i<=rowNumber; i++){
            String xpath = "//table[@id='example']/tbody/tr["+i+"]/td[6]";
            WebElement singleCell = driver.findElement(By.xpath(xpath));
            salary = Integer.parseInt(singleCell.getText().substring(1).replace(",",""));
            totalSalary = totalSalary + salary;

        }
        avarageSalary = totalSalary /rowNumber;
        System.out.println("totalSalary = " + totalSalary);
        System.out.println("avarageSalary = " + avarageSalary);
    }

    private int getNumberOfColumns() {
        List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id='example']//th"));
        return allColumns.size();
    }


    private int getNumberOfRows() {
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        return allRows.size();

    }
}
