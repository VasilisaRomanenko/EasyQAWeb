package Methods;

import Tests.AddOrganization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vasilisa on 22.02.2017.
 */
public class CreateOrganization {

    public void AddOrganization(WebDriver driver,String tit,String desc){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //click on AddOrganization
        driver.findElement(By.xpath(".//*[@id='head_menu']/div[2]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("organization_title")).sendKeys(tit);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("organization_description")).sendKeys(desc);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='new_organization']/input[2]")).click();
    }
}
