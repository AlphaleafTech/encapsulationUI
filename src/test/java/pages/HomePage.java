package pages;

import org.openqa.selenium.By;

public class HomePage {
    //---- Field
    private String url;
    private By loc_enter_button = By.xpath("");
    private By loc_page_banner = By.xpath("");
    private By loc_create_tab = By.xpath("");
    private By loc_evaluate_tab = By.xpath("");
    private By loc_run_tab = By.xpath("");

    //---- Constructor
    public HomePage(){ }

    public HomePage(String env) {
        String vettedURL = checkValidURL(env);
        url = vettedURL;
    }

    //---- Methods
    public void open() {
        // go to url
        // click the enter button
        // verify page banner visibility
    }

    public void visitCreate() {
        // highlight Create tab
        // click the Create tab
    }

    public void visitEvaluate() {
        // highlight Evaluate tab
        // click the Evaluate tab
    }

    public void visitRun() {
        // highlight Run tab
        // click the Run tab
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