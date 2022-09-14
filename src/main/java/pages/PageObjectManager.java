package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;
    public Login login;
    public QcAllocator qcAllocator;

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

}
