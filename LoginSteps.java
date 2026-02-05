package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {

    WebDriver driver;

    @Given("User is on login page")
    public void user_is_on_login_page() {

        System.out.println("Opening Login Page");

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }


    @When("User enters username and password")
    public void user_enters_username_and_password() {

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }


    @And("User clicks login button")
    public void user_clicks_login_button() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }


    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {

        String successMessage = driver.findElement(By.id("flash")).getText();
        System.out.println("Login Message: " + successMessage);

        if(successMessage.contains("You logged into a secure area")) {
            System.out.println("LOGIN TEST PASSED");
        } else {
            System.out.println("LOGIN TEST FAILED");
        }

        driver.quit();
    }

}
