package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import static engine.BaseTest.driver;
import static engine.BaseTest.loginPage;

public  class ManageGroupsPage {


   static WebDriverWait wait = new WebDriverWait(driver, 10000, 500);

   static WebElement topMenuList = driver.findElement(By.className("DashboardSubNav_dashboardSubNav__2v5eW"));

   static List<WebElement> topMenuItems = topMenuList.findElements(By.tagName("a"));

    public static void clickOnTopMenuItem(String topMenuItemName) {



            wait.until(ExpectedConditions.elementToBeClickable(topMenuItems.get()))
        topMenuItemName = topMenuItemName.toUpperCase();
        switch (topMenuItemName) {
            case "ASSIGNMENTS":
                topMenuItems.get(0).click();
            case "REPORTS":
                topMenuItems.get(1).click();
            case "ROSTER":
                topMenuItems.get(2).click();
            case "SUBSCRIPTIONS":
                topMenuItems.get(3).click();
            default:
                System.out.println("WRONG itemName");
        }

    }
    private  ManageGroupsPage(){

    }



}
