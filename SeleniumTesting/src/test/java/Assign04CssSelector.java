import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign04CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//clicking on checkbox using -> tag attribute
//		driver.findElement(By.cssSelector("input[checkbox]")).click();
		
		//searching for tshirt using-> tag id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		//
		
	}
}
