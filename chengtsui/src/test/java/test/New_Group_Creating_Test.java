package test;
import engine.BaseTest;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pom.LoginPage;

import pom.ManageGroupsPage;
import pom.ShelfPage;
import static pom.LoginPage.getLoginPage;
import static pom.ShelfPage.shelfPageUrl;

public class New_Group_Creating_Test extends BaseTest {
    @Test
    public void loginTest() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver,10000,500);

        LoginPage loginPage = getLoginPage();
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        loginPage.login("anush5educator@mailinator.com");
        loginPage.password("12345678");
        loginPage.submit();
        wait.until(ExpectedConditions.urlToBe(shelfPageUrl));

        ShelfPage.clickOnManageGroupsButton();

    ManageGroupsPage.clickOnTopMenuItem("Reports");


    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
