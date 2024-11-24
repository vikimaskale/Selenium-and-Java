import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element= driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
		WebElement e1=driver.findElement(By.xpath("(//a[contains(text(),'Notebooks')])"));
		Actions act1=new Actions(driver);
		
		act1.moveToElement(e1).perform();
	}
}
