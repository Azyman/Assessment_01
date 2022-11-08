package Base;

import Pages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest{
    public WebDriver driver;
    public WebDriverWait wait;

    public Page page;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");

        //Create object of Page class: Instantiate Page class
        page = new Page(this.driver,this.wait);
    }

    @AfterMethod
    public void captureScreenShots(ITestResult testResult){

        if(ITestResult.FAILURE == testResult.getStatus()){

            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir")+"/Resources/Screenshots/Failed/"+testResult.getName()+"_"+testResult.getStartMillis()+".png");
            try {
                FileHandler.copy(source,destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else if (ITestResult.SUCCESS == testResult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir")+"/Resources/Screenshots/Passed/"+testResult.getName()+"_"+testResult.getStartMillis()+".png");
            try {
                FileHandler.copy(source,destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
