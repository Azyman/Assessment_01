package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUser extends BasePage {

    public AddUser(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public static By firstName = By.name("FirstName");
    public static By lastName = By.name("LastName");
    public static By userName = By.name("UserName");
    public static By password = By.name("Password");
    public static By customer_companyA = By.xpath("//input[@value='15']");
    public static By getCustomer_companyB = By.xpath("//input[@value='16']");
    public static By customerRole = By.xpath("//select[@name='RoleId']");
    public static By salesTeam = By.xpath("//option[@value=0]");
    public static By customerTeam = By.xpath("//option[@value=1]");
    public static By adminTeam = By.xpath("//option[@value=2]");
    public static By email = By.name("Email");
    public static By cellPhone = By.name("Mobilephone");
    public static By cancelButton = By.xpath("//button[@class='btn btn-danger']");
    public static By saveButton = By.xpath("//button[@class='btn btn-success']");

}
