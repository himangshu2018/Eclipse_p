import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PomPage {
	@FindBy(how=How.ID,using="identifierId")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"identifierNext\"]/content/span")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"identifierNext\"]/content/span") 
	WebElement next;

}
