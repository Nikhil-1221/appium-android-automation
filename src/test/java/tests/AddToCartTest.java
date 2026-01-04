package tests;

import base.BaseTest;
import io.appium.java_client.AppiumBy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void addToCartTest() {

        driver.findElement(By.xpath(
            "	\r\n"
            + "(//android.view.ViewGroup[@content-desc=\"store item\"])[1]/android.view.ViewGroup[1]/android.widget.ImageView\r\n"
            + ""))
            .click();

        
        
     // Scroll until "Add To Cart" is visible then Click Add To Cart
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"Add To Cart\"))"
        )).click();
    }
}
