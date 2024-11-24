import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndRightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element= driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions act1=new Actions(driver);
		act1.contextClick(element).perform();
		Thread.sleep(2000);
		
		WebElement e2= driver.findElement(By.id("authentication"));
		act1.click(e2).perform();
		Thread.sleep(1000);
		
		WebElement e1= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act1.doubleClick(e1).perform();
		

		Thread.sleep(4000);
		driver.quit();
		
	}
}
