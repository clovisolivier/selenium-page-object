import org.junit.*;
import static org.junit.Assert.assertTrue;



/**
 * Created by clovisolivier on 03/01/2017.
 */
public class LauncherTest extends FunctionalTest {

    @Test
    public void checkResult(){

        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());
        
        homePage.enterResearch("toto");
        ResearchPage researchPage = homePage.submit();
        
        researchPage.researchKeyWordIs("toto");
        researchPage.researchKeyWordIsNot("tata");
        researchPage.displayResult();
    }
}
