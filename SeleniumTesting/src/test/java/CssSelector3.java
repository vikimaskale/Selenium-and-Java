import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//adding mail using -> tagname.classname
		driver.findElement(By.cssSelector("input.email")).sendKeys("surajdevapure@gmail.com");
		
		//adding password using -> tagname#id
		driver.findElement(By.cssSelector("input#Password")).sendKeys("suraj123");
		
		//click on login button using -> tagname classname attribute
		driver.findElement(By.cssSelector("input.button-1[value='Log in']")).click();
		Thread.sleep(2000);
		
		//click on books using -> linkText
		driver.findElements(By.partialLinkText("Books")).get(0).click();
		Thread.sleep(2000);
		
		//click on sort by using -> tagName
		driver.findElements(By.tagName("select")).get(1).click();
		Thread.sleep(2000);
		
		//click on Name: A to Z using -> tagName attribute
		driver.findElement(By.cssSelector("option[value='https://demowebshop.tricentis.com/books?orderby=5']")).click();
		Thread.sleep(4000);
		
		driver.quit();
	}
		
}
