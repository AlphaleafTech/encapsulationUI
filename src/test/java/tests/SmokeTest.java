package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.EvaluatePage;
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


    @Test
    public void verifyUserCanEvaluatePCModel() {
       BrowserUtil.openChrome();
       Automations.init(BrowserUtil.getDriver());

       HomePage homePageVar = new HomePage();
       homePageVar.setUrl("https://ailab.acr.org");
       homePageVar.open();
       homePageVar.visitEvaluate();

       EvaluatePage evaluatePageVar = new EvaluatePage();
       evaluatePageVar.evaluatePCModel();


       BrowserUtil.closeBrowser();
    }

}//end::class