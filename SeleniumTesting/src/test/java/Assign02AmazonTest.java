import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign02AmazonTest {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//OPENING AMAZON
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
//		Thread.sleep(3000);
		
		//sending mobile name
		driver.findElement(By.name("field-keywords")).sendKeys("narzo 10");
		Thread.sleep(3000);
		
		//taking screenshot of all options
		TakesScreenshot screenshot=  (TakesScreenshot) driver;
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Administrator\\Desktop\\java\\Src.png");
		FileUtils.copyFile(src, dest);
		
		//printing all options available
		List<WebElement> allitem=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div[contains(text(),'')]"));
		WebElement reqMobileElement=null;
		String mobileModel="narzo 10a";
		
		for(WebElement ele: allitem) {
			if(ele.getText().equals(mobileModel)) reqMobileElement=ele;
			System.out.println(ele.getText());
		}
		
		//clicking on req mobile ele
		reqMobileElement.click();
//		Thread.sleep(3000);
		
		//printing details of mobile
		WebElement details=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		System.out.println("Mobile details: "+details.getText());
		

		//click on see options
		driver.findElement(By.id("a-autoid-1-announce")).click();
//		Thread.sleep(3000);
		
		//click on add to card
		driver.findElement(By.id("submit.add-to-cart")).click();
//		Thread.sleep(2000);
		
		//proceed to checkout
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();
		
		//sign in page open
		//sending email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maskaleviki@gmail.com");
		
		//click on continue
		driver.findElement(By.xpath("//span[@id='continue']")).click();
		
		
		//sending password
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Viki@137");
		
		System.out.println("send password");
		
		//click on Sing in
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		System.out.println("click on sign in");
		
		
		
		//use this address for delivery
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
		
		//click on credit or debit card
		driver.findElement(By.xpath("//span[contains(text(),'Credit or debit card')]")).click();
		
		//click on + icon
		driver.findElement(By.xpath("(//img[@class='apx-add-pm-trigger-common-image'])[1]")).click();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//adding card number
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/div/input")).sendKeys("12345678909");
		
		
		
		
		
	}
}
