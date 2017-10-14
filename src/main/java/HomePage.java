import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by clovisolivier on 03/01/2017.
 */
public class HomePage extends PageObject {

    @FindBy(id="lst-ib")
    private WebElement searchInputField;

    @FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")
    private WebElement searchButton;

    public HomePage(WebDriver driver){
        super(driver);
        System.out.println("HomePage");
        assertTrue(this.searchInputField.isDisplayed());
    }

    public void enterResearch(String research){
        this.searchInputField.clear();
        this.searchInputField.sendKeys(research);
    }

    public ResearchPage submit(){
    		this.searchButton.click();
    		ResearchPage researchPage = new ResearchPage(driver);
    		assertTrue(researchPage.isInitialized());
    		return researchPage;
    }

    public boolean isInitialized() {
		System.out.println("isInitialized");
        return this.searchInputField.isDisplayed();
    }

}
