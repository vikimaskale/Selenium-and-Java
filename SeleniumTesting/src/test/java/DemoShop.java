import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//adding mail and password
		driver.findElement(By.name("Email")).sendKeys("surajdevapure@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("suraj123");
		
		//click on login button
		driver.findElement(By.xpath("//input [@class= 'button-1 login-button']")).click();
		Thread.sleep(2000);
		
		//click on books
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		Thread.sleep(2000);
		
		//click on computing and Internet book
		driver.findElement(By.xpath("//a[contains(text(),'Computing and Internet')]")).click();
		Thread.sleep(2000);
		
		//click on add to cart
		driver.findElement(By.xpath("//input [@id= 'add-to-cart-button-13']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[@class= 'cart-label']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
