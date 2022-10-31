package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page{

    public String text;
    public BasePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Generic wrapper methods
    public void doClick(By locator){
        driver.findElement(locator).click();
    }

    public void doSendKeys(By locator, String text){
        //this.text = text;
        driver.findElement(locator).sendKeys(text);
    }

    public String doGetText(By locator){
        return driver.findElement(locator).getText();
    }

}
