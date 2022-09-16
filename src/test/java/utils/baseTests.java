package utils;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class baseTests {

    public WebDriver driver;

    public baseTests() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\EBC_Java_Seleniun_Cucumber\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver = new ChromeDriver();
        driver.get("https://ebc-web-ct.azurewebsites.net");
        //Maximize current window
        driver.manage().window().maximize();
    }
    @BeforeClass
    public WebDriver setUp() {
        return this.driver;
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        //Delay execution for 5 seconds to view the maximize operation
//        Thread.sleep(10000);
        if (driver != null) {
            driver.quit();
        }

    }
}
