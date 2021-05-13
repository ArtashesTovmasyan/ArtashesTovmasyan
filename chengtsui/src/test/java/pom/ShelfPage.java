package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static engine.BaseTest.driver;


public class ShelfPage {
  static WebDriverWait wait = new WebDriverWait(driver,10000,500);
   public static   String shelfPageUrl = "https://staging.chengtsui.co/dashboard";

   public ShelfPage(){

   }




   public static void clickOnManageGroupsButton(){
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/nav/a"))).click();

   }


}
