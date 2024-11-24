import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assign14POMDemoShopSearchFunction {
	//declaration
	@FindBy(xpath="//input[@value='Search store'][@id='small-searchterms']")
	WebElement txtSearch;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement buttonSubmit;
	
	//initialization
	public Assign14POMDemoShopSearchFunction(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	
	//utilization
	public void enterSearchText(String str) {
		txtSearch.sendKeys(str);
	}
	
	public void clickSearch() {
		buttonSubmit.click();
	}
}
