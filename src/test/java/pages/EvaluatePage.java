package pages;

import org.openqa.selenium.By;
import static utils.Automations.*;

public class EvaluatePage {
    // --- Fields
    private By loc_usecase_dropdown = By.xpath("//select[@id='useCases']");
    private By loc_pc_option        = By.xpath("//option[contains(text(),'Classification')]");
    private By loc_dataset_dropdown = By.xpath("//select[@id='useCaseSelect']");
    private By loc_pc_dataset       = By.xpath("//option[contains(@value, 'My Site')]");
    private By loc_p_model          = By.xpath("//div/span[contains(text(),'Company 1')]");
    private By loc_evaluate_button  = By.xpath("//button[text()='Evaluate Models']");

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
