package Tests;

import Methods.*;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

/**
 * Created by Vasilisa on 07.02.2017.
 */
public class ImportExport extends BaseTest{

    @Test
    public void main() throws InterruptedException {

        LoginPage.login(driver, "vasilisa.klimchenko@gmail.com", "11111111");
        Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='head_menu']/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//div/div[1]/a/img")).click(); //Some project
        Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='left-menu']/li[4]/a")).click(); //click Testing Activities
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//div[2]/ul/li[2]/a")).click();  //click Test Plan
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//div[2]/div[2]/a[2]")).click(); // click on import
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='test_plan_id_csv']/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='test_plan_id_csv']/ul/li[2]/a/label")).click();
        //визиваю метод атач фа йл
        AttachFile attachFile = new AttachFile();
        attachFile.attachFileToLead(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("start-import")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='next']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='myModal']/div/div/div[2]/div/div/div[2]/span[2]")).click();

        Thread.sleep(3000);






    }
}
