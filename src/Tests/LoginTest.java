package Tests;

import Methods.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by Vasilisa on 21.02.2017.
 */
public class LoginTest extends BaseTest{
    @Test
    public void positiveLogin() throws InterruptedException {

        LoginPage.login(driver, "vasilisa.klimchenko@gmail.com", "11111111");
        LoginPage.logout(driver);
    }

    @Test
    public void negativeLogin() throws InterruptedException {

        LoginPage.login(driver, "vasilisa.klimchenko@gmail.com", "2222222");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement errorMessage = driver.findElement(By.className("message"));
        assertTrue(errorMessage.getText().contains("Invalid Email or password."));

    }

    @Test
    public void emptyLogin() throws InterruptedException {

        LoginPage.login(driver, "", "11111111");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement errorMessage = driver.findElement(By.xpath(".//*[@id='new_user']/div[1]/div[2]/label"));
        assertTrue(errorMessage.getText().contains("can't be blank"));

    }
}
