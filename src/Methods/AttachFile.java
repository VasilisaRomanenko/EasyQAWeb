package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vasilisa on 14.02.2017.
 */
public class AttachFile {
    public void attachFileToLead(WebDriver driver) throws InterruptedException {

        WebElement attach = driver.findElement(By.xpath("//input[@type='file']"));
        attach.sendKeys("C:\\Users\\Vasilisa\\Desktop\\new.csv");


    }
}
