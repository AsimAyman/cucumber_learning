package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver drive){
        PageFactory.initElements(drive,this);
    }
    @FindBy(id ="username")
    public WebElement userNameEle;
    @FindBy(css = "input[type=\"password\"]")
    public WebElement passwordEle;
    @FindBy(className = "fa")
     public   WebElement loginBtn;
    @FindBy(id = "flash")
    public WebElement banner;
    public void login(String name,String password){
        userNameEle.sendKeys(name);
        passwordEle.sendKeys(password);

    }


}
