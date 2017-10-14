import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

/**
 * Created by clovisolivier on 03/01/2017.
 */
public class ResearchPage extends PageObject {

	@FindBy(id = "logo")
	private WebElement logo;
	
	@FindBy(id = "hdtbSum")
    private WebElement menu;

    @FindBy(id  = "ires")
    private WebElement resultList;
    
    @FindBy (xpath = "//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/h3/a")
    private WebElement firstResult;
    
    @FindBy(id = "lst-ib")
    private WebElement searchInput;

    public ResearchPage(WebDriver driver){
        super(driver);
        assertTrue(this.resultList.isDisplayed());
    }

    public void enterResearch(String research){
        this.searchInput.clear();
        this.searchInput.sendKeys(research);
    }
    
    public String SearchValue(){
        return this.searchInput.getAttribute("value");
    }
    
    public boolean isInitialized() {
        return menu.isDisplayed();
    } 
    
    public boolean isInitializedSearchInput() {
        return searchInput.isDisplayed();
    }
    public String confirmationHeader(){
        return searchInput.getText();
    }

	public boolean displayResult() {
		assertTrue(resultList.isDisplayed());
		assertTrue(firstResult.isDisplayed());
		return false;
	}

	public void researchKeyWordIs(String string) {
        assertEquals(string, SearchValue());
	}

	public void researchKeyWordIsNot(String string) {
        assertTrue( SearchValue().compareTo(string)!=0);
	}


}
