package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchTest extends BaseTest {

    @Test
    public void verifyAppLaunch() {
        Assert.assertNotNull(driver);
    }
}
