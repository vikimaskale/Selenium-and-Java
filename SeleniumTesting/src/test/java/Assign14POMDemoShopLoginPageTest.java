import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign14POMDemoShopLoginPageTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//login
		Assign14POMDemoShopLoginPage loginPage= new Assign14POMDemoShopLoginPage(driver);
		loginPage.enterUsername("surajdevapure@gmail.com");
		loginPage.enterPassword("suraj123");
		Thread.sleep(2000);
		
		loginPage.clickLogin();
		
		//search functionality
		Assign14POMDemoShopSearchFunction search= new Assign14POMDemoShopSearchFunction(driver);
		search.enterSearchText("Computing and Internet");
		Thread.sleep(2000);
		
		search.clickSearch();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
