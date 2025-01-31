
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign07ExpliciteWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		//checking homepage loaded
		try {
			WebElement e1= driver.findElement(By.xpath("//td[text()='Customer ID']"));
			wait.until(ExpectedConditions.textToBePresentInElement(e1, e1.getText()));
			System.out.println("Homepage loaded");
		}catch(Exception E){
			System.out.println("Homepage not loaded"+ E.toString());
		}
		
		//adding data to delete
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		
		//checking for alert 
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alert is present");
		}catch(Exception E){
			System.out.println("Alert is absent"+ E.toString());
		}
		
		Alert a=driver.switchTo().alert();
//		a.accept();
		a.dismiss();
		
		//clicking on logo image
		driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']")).click();
		
		//waiting for page to load
		try {
			wait.until(ExpectedConditions.urlContains("guru99.com"));
			System.out.println("guru99.com url is loaded");
		}catch(Exception E){
			System.out.println("guru99.com url is not loaded"+ E.toString());
		}
		
		//clicking on Testing
		WebElement e1=driver.findElement(By.xpath("(//span[@class='nav-drop-title-wrap'])[1]"));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(e1));
			System.out.println("Testing is clickable");
		}catch(Exception E){
			System.out.println("Testing is not clickable"+ E.toString());
		}
		e1.click();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
