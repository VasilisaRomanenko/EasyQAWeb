package Methods;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Vasilisa on 09.02.2017.
 */
public class LoginPage {

    public static void login(WebDriver driver, String email, String pass) {
        driver.findElement(By.id("user_email")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys(email);
        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys(pass);
        driver.findElement(By.id("user_password")).submit();
    }


        public static void logout(WebDriver driver) throws InterruptedException {
        //        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='head_menu']/div[3]/a[2]")).click();
        driver.close();
    }



}


