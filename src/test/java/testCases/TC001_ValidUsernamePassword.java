package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

public class TC001_ValidUsernamePassword {

    WebDriver driver;

    @BeforeMethod
    public void openPage(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }

    @Test
    public void TC001(){

      HomePage homePage = new HomePage(driver);
      homePage.clickAppoinmentBtn();

    }

    @AfterMethod
    public void closeBrowser(){

        //driver.quit();

    }
}
