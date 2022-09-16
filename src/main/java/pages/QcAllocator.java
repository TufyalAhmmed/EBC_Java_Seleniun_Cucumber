package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class QcAllocator {
    public WebDriver driver;

    private By statusDropdownLink = By.xpath("//mat-select[@id='mat-select-0']");
    private By closedLink = By.xpath("//span[@class='mat-option-text'][normalize-space()='CLOSED']");
    private By assignedToLink = By.xpath("//legend[normalize-space()='QC Allocator']");
    private By searchBtn = By.xpath("//button[@type='button'][normalize-space()='Search']");
    private By scrollBottom = By.xpath("//div[@class='mat-paginator-outer-container']");
    private By scrollTop= By.xpath("//div[@class='col-md-1 bg-Grey-ey-1']");
    private By eyCheckId = By.xpath("//input[@id='mat-input-3']");
    private By eySearchBtn = By.xpath("//button[@type='button'][normalize-space()='Search']");

    public QcAllocator(WebDriver driver) {
        this.driver = driver;
    }
    public void setStatusDropdownLink(){
        driver.findElement(statusDropdownLink).click();
    }
    public void setClosedLink(){
        driver.findElement(closedLink).click();
    }
    public void setAssignedToLink(){
        driver.findElement(assignedToLink).click();
    }
    public void setSearchBtn(){
        driver.findElement(searchBtn).click();
    }
    public void setScrollBottom(){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
//        while (getNumberOfParagraphsPresent() < index) {
//            jsExecutor.executeScript(script);
//        }
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(scrollBottom));
    }
    public void setScrollTop(){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
//        while (getNumberOfParagraphsPresent() < index) {
//            jsExecutor.executeScript(script);
//        }
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(scrollTop));
    }
    public void setEyCheckId(){
        driver.findElement(eyCheckId).sendKeys("30001423");
    }
    public void setEySearchBtn(){
        driver.findElement(eySearchBtn).click();
    }

}

