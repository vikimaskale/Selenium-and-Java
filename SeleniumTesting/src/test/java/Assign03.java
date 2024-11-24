import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign03 {
	//printing books sortby data
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/books");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='products-orderby']")).click();
		
		List<WebElement>list= driver.findElements(By.xpath("//select[@name='products-orderby']/option[contains(text(),'')]"));
		
		for(WebElement data:list) {
			System.out.println(data.getText());
		}		
		
		
		
		
		
	}
}
