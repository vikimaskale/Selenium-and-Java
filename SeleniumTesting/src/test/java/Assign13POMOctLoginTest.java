import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign13POMOctLoginTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		Assign12POMOctLoginPage Ip=new Assign12POMOctLoginPage(driver);
		Ip.enterUsername("Admin");
		Ip.enterPassword("admin123");
		Ip.clickLogin();
	}
}
