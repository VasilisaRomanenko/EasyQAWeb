package Tests;

import Methods.CreateOrganization;
import Methods.LoginPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Vasilisa on 21.02.2017.
 */
public class AddOrganization extends BaseTest {

    @Test
    public void correctCreate() throws InterruptedException{
        LoginPage.login(driver, "vasilisa.klimchenko@gmail.com", "11111111");
        CreateOrganization neworganization;
        neworganization=new CreateOrganization();
        neworganization.AddOrganization(driver,"tit","desc");



    }
}
