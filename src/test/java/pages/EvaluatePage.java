package pages;

import org.openqa.selenium.By;
import static utils.Automations.*;

public class EvaluatePage {
    // --- Fields
    private By loc_usecase_dropdown = By.xpath("");
    private By loc_pc_option        = By.xpath("");
    private By loc_dataset_dropdown = By.xpath("");
    private By loc_pc_dataset       = By.xpath("");
    private By loc_p_model          = By.xpath("");
    private By loc_evaluate_button  = By.xpath("");

    // --- Constructor
    public EvaluatePage() { }

    // --- Methods
    public void evaluatePCModel() {
        click(loc_usecase_dropdown);
        click(loc_pc_option);
        click(loc_dataset_dropdown);
        click(loc_pc_dataset);
        click(loc_p_model);
        clickEvaluateButton();
    }

    //Helper method
    private void clickEvaluateButton() {
        highlight(loc_evaluate_button);
        click(loc_evaluate_button);
    }
}//end::class
