import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assign14POMDemoShopLoginPage {
	//declaration
	@FindBy(xpath="//input[@name='Email']")
	WebElement txtusr;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement txtPass;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement buttonsubmit;
	
	
	
	//initialization
	public Assign14POMDemoShopLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void enterUsername(String str) {
		txtusr.sendKeys(str);
	}
	
	public void enterPassword(String str) {
		txtPass.sendKeys(str);
	}
	
	public void clickLogin() {
		buttonsubmit.click();
	}
	
	public void Search() {
		
	}
	
	
	
}











