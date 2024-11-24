import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssselectorTesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://bstackdemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//sign in by using-> tag#id
		driver.findElement(By.cssSelector("a#signin")).click();
		Thread.sleep(4000);
		
		//sending username
		
		
	}
}
