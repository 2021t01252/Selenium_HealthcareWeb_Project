package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    WebDriver driver;
    public FormPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='txt-username']")
    WebElement usernameField;

    @FindBy(xpath = "//input[@id='txt-password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@id='btn-login']")
    WebElement loginButton;


    public void submitForm(String userName, String password){
        usernameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public String getCurrentUrl(){
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }




}
