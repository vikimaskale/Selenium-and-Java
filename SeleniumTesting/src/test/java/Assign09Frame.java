import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign09Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		//switching to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe [@id='singleframe']")));
		
		//sending data 
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("viki");
		
		//coming by to default page
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//clicking on button
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		//switching to parent frame
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='Multiple']/iframe")));
		
		//switching to child frame
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='iframe-container']/iframe")));
		
		//sending data
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("viki");
		
		
		
		
		
//		driver.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(4000);
		driver.quit();
	}
}
