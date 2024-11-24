import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement source= driver.findElement(By.id("column-a"));
		WebElement drop= driver.findElement(By.id("column-b"));
		Actions act1=new Actions(driver);
		act1.dragAndDrop(source, drop).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
