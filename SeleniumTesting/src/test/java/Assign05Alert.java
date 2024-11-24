import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign05Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		
		Alert a=driver.switchTo().alert();
		
		System.out.println(a.getText());
		a.accept();
//		a.dismiss();
		
		
		Thread.sleep(3000);
//		driver.quit();
		
	}
}
