package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URI;
import java.net.URL;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeClass
    public void setup() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("platformName", "Android");
        cap.setCapability("appium:deviceName", "Small Phone API 36.0");
        cap.setCapability("appium:automationName", "UiAutomator2");

        // APK LOCATION
        cap.setCapability("appium:app",System.getProperty("user.dir") + "/app/onlineshop.apk");

        
        
     // Appium server URL
        URL url = URI.create("http://127.0.0.1:4723/").toURL();
        driver = new AndroidDriver(url, cap);
    }

//    @AfterClass
//    public void tearDown() {
//    	
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
