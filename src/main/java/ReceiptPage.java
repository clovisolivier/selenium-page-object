import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.bind.annotation.W3CDomHandler;

import static org.junit.Assert.assertTrue;

/**
 * Created by clovisolivier on 03/01/2017.
 */
public class ReceiptPage extends PageObject {

    @FindBy(tagName = "h1")
    private WebElement header;

    public ReceiptPage(WebDriver driver){
        super(driver);
        assertTrue(this.header.isDisplayed());
    }
    public boolean isInitialized() {
        return header.isDisplayed();
    }
    public String confirmationHeader(){
        return header.getText();
    }
}
