package Base;

import Pages.AddUser;
import Pages.BasePage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.random.RandomGenerator;

public class HomePageTest extends BaseTest{

    HomePage homePage = new HomePage(driver,wait);
    @Test(priority = 1)
    public void homePageTitleTest(){
        String title = page.getInstance(HomePage.class).getHomePageTitle();
        System.out.println("Homepage title is: "+title);
        Assert.assertEquals(title,"Protractor practice website - WebTables");
    }

    @Test(priority = 2)
    public void addUser1(){
        page.getInstance(HomePage.class).addUser(By.xpath("//i[@ng-class='iconClass']"));
        String header = page.getInstance(BasePage.class).doGetText(By.xpath("//h3[@class='ng-binding']"));
        System.out.println("Add user page header is: "+header);
        Assert.assertEquals(header,"Add User");
        page.getInstance(BasePage.class).doSendKeys(AddUser.firstName,"FName1"+"_"+homePage.randomNumberGen());
        page.getInstance(BasePage.class).doSendKeys(AddUser.lastName,"LName1");
        page.getInstance(BasePage.class).doSendKeys(AddUser.userName,"User1");
        page.getInstance(BasePage.class).doSendKeys(AddUser.password,"Pass1");
        page.getInstance(BasePage.class).doClick(AddUser.customer_companyA);
        page.getInstance(BasePage.class).doClick(AddUser.customerRole);
        page.getInstance(BasePage.class).doClick(AddUser.adminTeam);
        page.getInstance(BasePage.class).doSendKeys(AddUser.email,"admin@mail.com");
        page.getInstance(BasePage.class).doSendKeys(AddUser.cellPhone,"082555");
        page.getInstance(BasePage.class).doClick(AddUser.saveButton);
    }

    @Test(priority = 3)
    public void addUser2(){
        page.getInstance(HomePage.class).addUser(By.xpath("//i[@ng-class='iconClass']"));
        String header = page.getInstance(BasePage.class).doGetText(By.xpath("//h3[@class='ng-binding']"));
        System.out.println("Add user page header is: "+header);
        Assert.assertEquals(header,"Add User");
        page.getInstance(BasePage.class).doSendKeys(AddUser.firstName,"FName2"+"_"+homePage.randomNumberGen());
        page.getInstance(BasePage.class).doSendKeys(AddUser.lastName,"LName2");
        page.getInstance(BasePage.class).doSendKeys(AddUser.userName,"User2");
        page.getInstance(BasePage.class).doSendKeys(AddUser.password,"Pass2");
        page.getInstance(BasePage.class).doClick(AddUser.customer_companyA);
        page.getInstance(BasePage.class).doClick(AddUser.customerRole);
        page.getInstance(BasePage.class).doClick(AddUser.customerTeam);
        page.getInstance(BasePage.class).doSendKeys(AddUser.email,"customer@mail.com");
        page.getInstance(BasePage.class).doSendKeys(AddUser.cellPhone,"083444");
        page.getInstance(BasePage.class).doClick(AddUser.saveButton);
    }

    @Test(priority = 4)
        public void printRandNum(){
        page.getInstance(HomePage.class).randomNumberGen();
    }

}
