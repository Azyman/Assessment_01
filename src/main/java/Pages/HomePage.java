package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
AddUser addUser = new AddUser(driver,wait);
    //public String locator;
    public By addUserLink = By.xpath("//i[@ng-class='iconClass']");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public String getHomePageTitle(){
        return driver.getTitle();
    }

    public AddUser addUser(By locator){
        doClick(addUserLink);
        return addUser;
        //return null;
    }
}
