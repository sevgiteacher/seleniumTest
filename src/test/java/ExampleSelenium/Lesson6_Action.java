package ExampleSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Lesson6_Action extends Base{

    @Test
    public void sliderMove() throws InterruptedException {
        driver.get("https://demoqa.com/slider/");
        driver.manage().window().maximize();
        WebElement slider = driver.findElement(By.id("slider"));
        Actions actions = new Actions(this.driver);
        actions.clickAndHold(slider).moveByOffset(150,0).release().perform();
        Thread.sleep(2000);
    }

    @Test
    public void hoverOverToolTip() throws InterruptedException {
        driver.get("https://demoqa.com/tooltip/");
        driver.manage().window().maximize();
        WebElement inputBox = driver.findElement(By.id("age"));
        Actions actions = new Actions(this.driver);
        actions.moveToElement(inputBox).perform();
        Thread.sleep(2000);
        Assert.assertTrue(inputBox.isDisplayed());
    }

    @Test
    public void hoverOver() throws InterruptedException {
        driver.get("https://demoqa.com/menu/");
        driver.manage().window().maximize();
        Actions actions = new Actions(this.driver);
        WebElement first = driver.findElement(By.id("ui-id-9"));
        WebElement second = driver.findElement(By.id("ui-id-13"));
        WebElement third = driver.findElement(By.id("ui-id-16"));
        actions.moveToElement(first).pause(2000).moveToElement(second).pause(2000).moveToElement(third).pause(2000).click().build().perform();
        Thread.sleep(2000);
    }

    @Test
    public void curryNavigation() throws InterruptedException {
        driver.get("https://www.currys.co.uk/gbuk/index.html");
        Thread.sleep(3000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.manage().window().maximize();
        Actions actions = new Actions(this.driver);
        WebElement computing = driver.findElement(By.xpath("//a[@class='chevron'][contains(text(),'Computing')]"));
        WebElement laptop = driver.findElement(By.xpath("//a[@class='chevron'][contains(text(),'Laptop')]"));
        actions.moveToElement(computing).pause(1000).moveToElement(laptop).pause(1000).click().build().perform();
        Thread.sleep(2000);
    }

    @Test
    public void dragAndDrop1() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();
        Actions actions = new Actions(this.driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        actions.dragAndDrop(source,target).perform();
        Thread.sleep(5000);
        //second way
//        actions.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().build().perform();
//        Thread.sleep(3000);
    }

    @Test
    public void dragAndDrop2() throws InterruptedException {
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        Actions actions = new Actions(this.driver);
        WebElement box = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(box,target).perform();
        Thread.sleep(3000);
    }



}
