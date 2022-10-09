package tests;

import org.testng.annotations.Test;
import utils.Automations;
import utils.BrowserUtil;

public class SmokeTest {


    @Test
    public void testCase1() {
        BrowserUtil.openChrome();
        Automations.sleep(5);
        BrowserUtil.closeBrowser();
    }

}
