import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetStoreTesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://petstore.octoperf.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//clicking on enter the store
		driver.findElement(By.xpath("//a[contains(text(),'Enter the Store')]")).click();
		Thread.sleep(2000);
		
		//clicking on Cats
		driver.findElement(By.xpath("//img [@src= '../images/cats_icon.gif']")).click();
		Thread.sleep(3000);
		
		//selecting "FL-DSH-01" product id
		driver.findElement(By.xpath("//a[contains(text(),'FL-DSH-01')]")).click();
		Thread.sleep(2000);
		
		//add to cart
		driver.findElement(By.xpath("(//a[contains(text(),'Add to Cart')])[1]")).click();
		Thread.sleep(2000);
		
		//
		WebElement element=driver.findElement(By.xpath("//input [@name= 'EST-14']"));
		element.clear();
		element.sendKeys("3");
		
		WebElement element2=driver.findElement(By.xpath("//a [text()= 'EST-14']"));
		System.out.println(element2.getText());
		
		driver.findElement(By.xpath("(//a [@class= 'Button'])[2]")).click();
		Thread.sleep(2000);
		
	}
}
