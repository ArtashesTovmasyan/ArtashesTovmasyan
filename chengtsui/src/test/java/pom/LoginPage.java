package pom;

import org.openqa.selenium.By;
import engine.BaseTest;
import static engine.BaseTest.driver;
import static engine.BaseTest.loginPage;

public class LoginPage  {
    private LoginPage() {
        if (driver.getCurrentUrl() != loginPage) {
            driver.get(loginPage);

        }
    }

    public static LoginPage getLoginPage() {   //getter for LoginPage constructor
        return new LoginPage();
    }

    // method for login input
    public void login(String login) {

        driver.findElement(By.name("email")).sendKeys(login);
    }

    // method for password input
    public void password(String password) {

        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void submit() {
        driver.findElement(By.tagName("button")).click();
    }

    public void navigateToManageSettings() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/nav/a"));
    }


}