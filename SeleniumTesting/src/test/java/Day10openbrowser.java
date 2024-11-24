import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10openbrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		
//		driver.navigate().to("https://demowebshop.tricentis.com/login");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		//adding mail and password
//		driver.findElement(By.name("Email")).sendKeys("surajdevapure@gmail.com");
//		driver.findElement(By.name("Password")).sendKeys("suraj123");
//			
//		//click on login button
//		driver.findElement(By.xpath("//input [@class= 'button-1 login-button']")).click();
//		Thread.sleep(2000);
//		
//		//click on books
//		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
//		Thread.sleep(2000);
		
		
		driver.navigate().to("https://demowebshop.tricentis.com/books");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.id("products-orderby"));
		Select select= new Select(element);
		//selectByIndex
		select.selectByIndex(1);
		
		//selectByValue
//		select.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
		
		//selectByVisibleText
//		select.selectByVisibleText("Name: A to Z");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
