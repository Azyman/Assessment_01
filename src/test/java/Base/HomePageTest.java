package Base;

import Pages.AddUser;
import Pages.BasePage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    BasePage basePage;
    @Test(priority = 1)
    public void homePageTitleTest(){
        String title = page.getInstance(HomePage.class).getHomePageTitle();
        System.out.println("Homepage title is: "+title);
        Assert.assertEquals(title,"Protractor practice website - WebTables");
    }

    @Test(priority = 2)
    public void addUser(){
        page.getInstance(HomePage.class).addUser(By.xpath("//i[@ng-class='iconClass']"));
        String header = page.getInstance(BasePage.class).doGetText(By.xpath("//h3[@class='ng-binding']"));
        System.out.println("Add user page header is: "+header);
        Assert.assertEquals(header,"Add User");
        page.getInstance(BasePage.class).doSendKeys(AddUser.firstName,"Azory");
        page.getInstance(BasePage.class).doSendKeys(AddUser.lastName,"Kavhuru");
        page.getInstance(BasePage.class).doSendKeys(AddUser.userName,"akavhuru");
        page.getInstance(BasePage.class).doSendKeys(AddUser.password,"@test123");
        page.getInstance(BasePage.class).doClick(AddUser.customer_companyA);
        page.getInstance(BasePage.class).doClick(AddUser.customerRole);
        page.getInstance(BasePage.class).doClick(AddUser.salesTeam);
        page.getInstance(BasePage.class).doSendKeys(AddUser.email,"azorykavhuru@gmail.com");
        page.getInstance(BasePage.class).doSendKeys(AddUser.cellPhone,"774666777");
        page.getInstance(BasePage.class).doClick(AddUser.saveButton);
    }
}
