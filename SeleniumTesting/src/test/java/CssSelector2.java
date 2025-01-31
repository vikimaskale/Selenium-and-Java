import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//sending text in searchbox using-> tag#id
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Dell laptop");
		Thread.sleep(3000);
		
		//selecting laptop using tag.classname
		driver.findElements(By.cssSelector("span.s-heavy")).get(9).click();
		
		driver.findElements(By.cssSelector("img.s-image")).get(3).click();
		
		
		
//		driver.quit();
		
	}
}
