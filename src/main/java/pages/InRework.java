package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InRework {
    public WebDriver driver;
    private By inReworkLink = By.xpath("//span[@class='mat-option-text'][normalize-space()='IN REWORK']");
    private By eYIdFieldLink = By.xpath("//input[@ng-reflect-name='EYId']");
    private By assignInfo = By.xpath("//input[@ng-reflect-name='AssignedTo']");
    private By eyCheckId = By.xpath("//input[@ng-reflect-name='EYCheckId']");
//    private By datarange = By.xpath("");
    private By clientName = By.xpath("//input[@ng-reflect-name='client']");
    private By severity = By.xpath("//input[@ng-reflect-name='Severity']");
    private By candidateName = By.xpath("//input[@ng-reflect-name='CandidateName']");
    public  InRework(WebDriver driver) {
        this.driver = driver;
    }
    public void setInReworkLink(){
        driver.findElement(inReworkLink).click();
    }
    public void seteYIdFieldLink(){
        driver.findElement(eYIdFieldLink).sendKeys("EBC1001-20011");
    }
    public void setAssignInfo(){
        driver.findElement(assignInfo).sendKeys("Verifier Executive");
    }
    public void setEyCheckId(){
        driver.findElement(eyCheckId).sendKeys("300013");
    }
//    public void setDatarange(){
//        driver.findElement(datarange).sendKeys("");
//    }
    public void setClientName(){
        driver.findElement(clientName).sendKeys("Company 1");
    }
    public void setSeverity(){
        driver.findElement(severity).sendKeys("Minor Discrepant");
    }
    public void setCandidateName(){
        driver.findElement(candidateName).sendKeys("demofour demolastfour");
    }
}
