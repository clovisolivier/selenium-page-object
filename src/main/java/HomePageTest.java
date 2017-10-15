import org.junit.*;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;



/**
 * Created by clovisolivier on 03/01/2017.
 */
public class HomePageTest extends FunctionalTest {

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
    
    @Test
    public void checkResultBis(){
        
    	    HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());
        
        homePage.enterResearch("moto");
        ResearchPage researchPage = homePage.submit();
        
        researchPage.researchKeyWordIs("moto");
        researchPage.researchKeyWordIsNot("mata");
        researchPage.displayResult();
    }
    
    
  
}
