package Tests;


import Methods.CreateProject;
import Methods.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Random;


/**
 * Created by Vasilisa on 22.02.2017.
 */
public class AddProject extends BaseTest{

    @Test
    public void positiveProject()throws InterruptedException{
        LoginPage.login(driver, "vasilisa.klimchenko@gmail.com", "11111111");
        //create змінна оголошую змынну що э така
        CreateProject newproject;
        //create новий обэкт (екземпляр класса)
        newproject= new CreateProject();
        // визиваю метод
        Random generator = new Random();
        int randstr = generator.nextInt(200000);
        String rand = Integer.toString(randstr);
        newproject.AddProject(driver, rand);






    }
}