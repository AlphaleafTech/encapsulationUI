package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Automations;
import utils.BrowserUtil;

public class SmokeTest {


    @Test
    public void verifyAilabPages() {
        BrowserUtil.openChrome();
        Automations.init(BrowserUtil.getDriver());

        HomePage homePageVar = new HomePage();
        homePageVar.setUrl("https://ailab.acr.org");
        homePageVar.open();
        homePageVar.visitCreate();
        homePageVar.visitEvaluate();
        homePageVar.visitRun();

        BrowserUtil.closeBrowser();
    }

}//end::class