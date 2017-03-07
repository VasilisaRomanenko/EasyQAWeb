package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vasilisa on 22.02.2017.
 */
public class CreateProject {

    public void AddProject(WebDriver driver, String rand) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath(".//*[@id='head_menu']/div[2]/a[2]")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='organization']/div/span")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@id='organization']/ul/li[3]/a/label")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='new_project']/div/div[1]/div[2]/div/label[1]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='new_project']/div/div[1]/div[2]/div/label[2]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='new_project']/div/div[1]/div[2]/div/label[3]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='project_title']")).sendKeys(rand);
        driver.findElement(By.name("commit")).click();
    }

}
