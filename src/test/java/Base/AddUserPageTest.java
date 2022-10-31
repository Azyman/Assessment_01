package Base;

import Pages.AddUser;
import Pages.BasePage;
import org.testng.annotations.Test;

public class AddUserPageTest extends BaseTest{

    @Test
    public void verifyAddUserHeaderTest(){
            page.getInstance(BasePage.class).doSendKeys(AddUser.firstName,"Azory");
            page.getInstance(BasePage.class).doSendKeys(AddUser.lastName,"Kavhuru");
            page.getInstance(BasePage.class).doSendKeys(AddUser.userName,"akavhuru");
            page.getInstance(BasePage.class).doSendKeys(AddUser.password,"@test123");
            page.getInstance(BasePage.class).doClick(AddUser.customer_companyA);
            page.getInstance(BasePage.class).doSendKeys(AddUser.email,"azorykavhuru@gmail.com");
            page.getInstance(BasePage.class).doSendKeys(AddUser.cellPhone,"774666777");
            page.getInstance(BasePage.class).doClick(AddUser.saveButton);
        }
    }

