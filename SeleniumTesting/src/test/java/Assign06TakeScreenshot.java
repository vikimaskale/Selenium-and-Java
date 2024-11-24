import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign06TakeScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		driver.navigate().to("https://petstore.octoperf.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot=  (TakesScreenshot) driver;
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		
		//everytime change Src1 -> Src2-> Src3 and so on otherwise it will 
		//replace the previous screenshot
		File dest = new File("C:\\Users\\Administrator\\Desktop\\java\\Src.png");
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(4000);
		driver.quit();
	}
}
