package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Vasilisa on 09.02.2017.
 */
public class BaseTest {


        public WebDriver driver;
        public String baseUrl = "http://qa_dashboard.test.thinkmobiles.com:8085";

        @BeforeMethod
        public void SetUp() {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
        }

        @AfterMethod
        public void tearDown() throws Exception {
            driver.close();
        }
    }

