package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class L2_PendingReview {
    public WebDriver driver;

    private By l2PendingReview = By.xpath("//mat-option[@ng-reflect-value='L2_PendingReview']");
    private By eYIdFieldLink = By.xpath("//input[@ng-reflect-name='EYId']");
    private By assignInfo = By.xpath("//input[@ng-reflect-name='AssignedTo']");
    private By eyCheckId = By.xpath("//input[@ng-reflect-name='EYCheckId']");
    private By clientInfo = By.xpath("//input[@ng-reflect-name='client']");
    private By severity = By.xpath("//input[@ng-reflect-name='Severity']");
    private By checkType = By.xpath("//input[@ng-reflect-name='CheckType']");
    private By candidateName = By.xpath("//input[@ng-reflect-name='CandidateName']");

    private By tatStatusDropdown = By.xpath("//div[@id='mat-select-value-3']");
    private By outOfTAT = By.xpath("//span[normalize-space()='Out Of TAT']");
    private By familyTypeDropdown = By.xpath("//div[@id='mat-select-value-7']");
    private By familyTypeDropdownAddressCheck = By.xpath("//span[normalize-space()='Address Check']");
    private By scrollandSelectCheckbox = By.xpath("//mat-cell[@role='gridcell']//input[@type='checkbox']");
    private By scrollBeforeAnActionMethod = By.xpath("//body//app-root//mat-row[1]");
    private By actionDropdown = By.xpath("//div[@class='mat-select-trigger ng-tns-c126-33']");
    private By selectAssigntoQCVerifier = By.xpath("//span[normalize-space()='Assign to QC Verifier']");
    private By assignUserDropdown = By.xpath("//div[@class='mat-select-trigger ng-tns-c126-35']");
    private By qcVerifierExecutive = By.xpath("//span[normalize-space()='QC Verifier Executive']");
    private By AssignButton = By.xpath("//div[@class='pull-right']//div[@class='pull-left']");







    public L2_PendingReview(WebDriver driver) {
        this.driver = driver;
    }
    public void setL2PendingReview(){
        driver.findElement(l2PendingReview).click();
    }
    public void seteYIdFieldLink(){
        driver.findElement(eYIdFieldLink).sendKeys("EBC1001-20574");
    }
    public void setAssignInfo(){
        driver.findElement(assignInfo).sendKeys(" QC Verifier Executive");
    }
    public void setEyCheckId(){
        driver.findElement(eyCheckId).sendKeys("30003545");
    }
    public void setClientInfo(){
        driver.findElement(clientInfo).sendKeys("Company 1");
    }
    public void setSeverity(){
        driver.findElement(severity).sendKeys("Clear");
    }
    public void setCheckType(){
        driver.findElement(checkType).sendKeys("Address Check");
    }
    public void setCandidateName(){
        driver.findElement(candidateName).sendKeys("TestRicha TestBansal");
    }


    public void setTatStatusDropdown(){
        driver.findElement(tatStatusDropdown).click();
    }
    public void setOutOfTAT(){
        driver.findElement(outOfTAT).click();
    }
    public void setFamilyTypeDropdown(){
        driver.findElement(familyTypeDropdown).click();
    }
    public void setFamilyTypeDropdownAddressCheck(){
        driver.findElement(familyTypeDropdownAddressCheck).click();
    }
    public void setScrollPage() throws InterruptedException {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(scrollandSelectCheckbox));
    }
    public void setScrollandSelectCheckbox() throws InterruptedException {
//        String script = "window.scrollTo(0, document.body.scrollHeight)";
//        var jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(scrollandSelectCheckbox));
//          Thread.sleep(3000);
        driver.findElement(scrollandSelectCheckbox).click();
    }
    public void setScrollbeforeAnActionMethod(){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(actionDropdown));
    }
    public void setActionDropdown(){
        driver.findElement(actionDropdown).click();
    }
    public void setSelectAssigntoQCVerifier(){
        driver.findElement(selectAssigntoQCVerifier).click();
    }
    public void setAssignUserDropdown(){
        driver.findElement(assignUserDropdown).click();
    }
    public void setQcVerifierExecutive(){
        driver.findElement(qcVerifierExecutive).click();
    }
    public void setAssignButton(){
        driver.findElement(AssignButton).click();
    }

}
