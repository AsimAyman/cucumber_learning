package step_definition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginStepDefinition {
      LoginPage loginPage = null;
      WebDriver driver ;
      @Given("user navigate to the login screen")
      public void navigateToBrowser() throws InterruptedException {
            System.out.println("111111111111111111111");
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://the-internet.herokuapp.com/login");
            loginPage=new LoginPage(driver);
            Thread.sleep(3000);
      }

      @When("^user enter valid \"(.*)\" and \"(.*)\"$")
      public void validLogin(String name,String password){
               loginPage.login(name, password);
      }
      @And("click on login button")
      public void clickOnLoginBtn() throws InterruptedException {
             loginPage.loginBtn.click();
             Thread.sleep(3000);
      }
      @Then("user could login successfully")
      public void assertLogin(){
            String expectedResult = "You logged into a secure area!";
            String actualResult   = loginPage.banner.getText();
            Assert.assertEquals(actualResult.contains(expectedResult),true);
      }
      @After
      public void close(){
            driver.quit();
      }

}
