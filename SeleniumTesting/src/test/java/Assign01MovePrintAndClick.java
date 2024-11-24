import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign01MovePrintAndClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ul= driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ul).perform();
		
		
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='sublist firstLevel'])[1]/li/a[contains(text(), '')]"));
//		List<WebElement> list=driver.findElements(By.xpath("((//div[@class='header-menu']/ul)/li)[2]/ul/li/a"));
		
		
		for(int i=0;i<list.size();i++) {
			WebElement a=list.get(i);
			System.out.println(a.getText());
		}
		
		
		
	}
}
