package lessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lolik on 14.05.2019
 */
public class MyTest {


    @Test(invocationCount = 100)
    public void testA(){

        new ChromeDriver();
        System.out.println("TEST A");
    }

    @Test
    public void testB(){
        System.out.println("TEST B");
    }

}
