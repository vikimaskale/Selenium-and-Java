import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDeselect {
	public static void main(String[] args) throws InterruptedException {
		
		/* *******************use deselect is applied only for multiselect*********** */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/Administrator/Desktop/sdet/Text.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//locating ele
		WebElement element=driver.findElement(By.id("slv"));
		Select select= new Select(element);
		select.selectByIndex(0);
		select.selectByValue("k");
		select.selectByVisibleText("Ac");
		Thread.sleep(2000);
		
		select.deselectByIndex(0);
		Thread.sleep(2000);
		
		select.deselectByValue("k");
		Thread.sleep(2000);
		
		select.deselectByVisibleText("Ac");
		Thread.sleep(2000);
		
//		select.deselectAll();
		
		driver.quit();
		
	}
}
