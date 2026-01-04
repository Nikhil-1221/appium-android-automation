package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

    	 driver.findElement(By.xpath(
    	            "//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView"))
    	            .click();
    	 driver.findElement(By.xpath(
    	            "//android.widget.TextView[@text=\"Log In\"]"))
    	            .click();

        driver.findElement(By.xpath(
            "	\r\n"
            + "//android.widget.EditText[@content-desc=\"Username input field\"]\r\n"
            + ""))
            .sendKeys("bob@example.com");

        driver.findElement(By.xpath(
            "//android.widget.EditText[@content-desc=\"Password input field\"]"))
            .sendKeys("10203040");

        driver.findElement(By.xpath(
            "	\r\n"
            + "//android.view.ViewGroup[@content-desc=\"Login button\"]"))
            .click();
    }
}
