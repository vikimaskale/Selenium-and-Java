
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign11Scrolling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		
/************************* isEnabled, isSelected, isDisplayed and Scroll**********************************************************/
		
		driver.navigate().to("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
		//checking logo is displayed and enabled
		WebElement logo= driver.findElement(By.xpath(" (//a[contains(text(), 'Selenium')])[1]"));
		System.out.println("logo displayed:"+ logo.isDisplayed());
		System.out.println("logo isenabled:"+ logo.isEnabled());
		
		//list of checkboxes
		List <WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//selecting alternate checkbox
		for(int i=0;i<checkboxes.size();i++) {
			WebElement checkbox=checkboxes.get(i);
			if(i%2==0)checkbox.click();
		}
		
		//count of selected checkboxes
		int count=0;
		for(WebElement checkbox:checkboxes) {
			if(checkbox.isSelected())count++;
		}
		System.out.println("Total checkbox:"+checkboxes.size());
		System.out.println("Selected checkbox:"+count);
		
		Thread.sleep(3000);
		
		//scrolling
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String scrolldown = "window.scrollBy(0,1000)";
		js.executeScript(scrolldown);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
