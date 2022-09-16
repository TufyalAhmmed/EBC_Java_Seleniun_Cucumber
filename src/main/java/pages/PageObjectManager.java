package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;
    public Login login;
    public QcAllocator qcAllocator;
    public InRework inRework;
    public L2_PendingReview l2_PendingReview;

    public PageObjectManager(WebDriver driver) {
        this.driver =driver;
    }
    public Login getLogin () {
        login = new Login(driver);
        return login;
    }
    public QcAllocator getQcAllocator(){
        qcAllocator = new QcAllocator(driver);
        return qcAllocator;
    }
    public  InRework getInRework(WebDriver driver) {
        inRework = new InRework(driver);
        return inRework;
    }
    public L2_PendingReview getL2_PendingReview(WebDriver driver){
        l2_PendingReview = new L2_PendingReview(driver);
        return l2_PendingReview;
    }

}
