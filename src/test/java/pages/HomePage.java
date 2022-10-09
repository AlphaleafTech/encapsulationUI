package pages;

import org.openqa.selenium.By;
import utils.Automations;

import static utils.Automations.*;

public class HomePage {
    //---- Field
    private String url;
    private By loc_enter_button = By.xpath("//a/button[contains(text(), 'ENTER')]");
    private By loc_page_banner = By.xpath("//h1[contains(text(), 'Welcome')]");
    private By loc_create_tab = By.xpath("//li/a/span[text()='Create']");
    private By loc_evaluate_tab = By.xpath("//li/a/span[text()='Evaluate']");
    private By loc_run_tab = By.xpath("//li/a/span[text()='Run']");

    //---- Constructor
    public HomePage(){ }

    public HomePage(String env) {
        String vettedURL = checkValidURL(env);
        url = vettedURL;
    }

    //---- Methods
    public void open() {
        visit(url);
        click(loc_enter_button);
        highlight(loc_page_banner);
        isVisible(loc_page_banner);
    }

    public void visitCreate() {
        highlight(loc_create_tab);
        click(loc_create_tab);
        sleep(3);
    }

    public void visitEvaluate() {
       highlight(loc_evaluate_tab);
       click(loc_evaluate_tab);
       sleep(3);
    }

    public void visitRun() {
       highlight(loc_run_tab);
       click(loc_run_tab);
       sleep(3);
    }

    // Getter for URL
    public String getUrl() {
        return url;
    }

    // Setter for URL
    public void setUrl(String newUrl) {
        String vettedURL = checkValidURL(newUrl);
        url = vettedURL;
    }

    // Helper method
    private String checkValidURL(String address) {
        boolean notForWeb = !address.contains("https");
        boolean notForAilab = !address.contains("ailab");
        if(notForWeb || notForAilab) {
            String msg = "Provided web address is not correct!";
                  msg += "Given: " + address;
           throw new IllegalArgumentException(msg);
        }
        return address;
    }
}//end::class