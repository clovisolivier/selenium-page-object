import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by clovisolivier on 03/01/2017.
 */
public class SignUpPage extends PageObject {

    @FindBy(id="firstname")
    private WebElement firstName;

    @FindBy(id="lastname")
    private WebElement lastName;

    @FindBy(id="address")
    private WebElement address;

    @FindBy(id="zipcode")
    private WebElement zipCode;

    @FindBy(id="signup")
    private WebElement submitButton;

    public SignUpPage(WebDriver driver){
        super(driver);
        assertTrue(this.firstName.isDisplayed());
    }

    public void enterName(String firstName, String lastName){
        this.firstName.clear();
        this.firstName.sendKeys(firstName);

        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    public void enterAdress(String adress, String zipCode){
        this.address.clear();
        this.address.sendKeys(adress);

        this.zipCode.clear();
        this.zipCode.sendKeys(zipCode);
    }

    public ReceiptPage submit(){
        submitButton.click();
        return new ReceiptPage(driver);
    }

    public boolean isInitialized() {
        return firstName.isDisplayed();
    }
}
