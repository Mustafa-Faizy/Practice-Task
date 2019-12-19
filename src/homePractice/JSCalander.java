package homePractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSCalander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.expedia.com");
		
		WebElement deaparturCalander = driver.findElement(By.xpath("//input[@id='package-departing-hp-package']"));
		
		MyUtility.selectDateByJS(driver, deaparturCalander, "11/29/2019");
		
		WebElement returningCalander = driver.findElement(By.xpath("//input[@id='package-returning-hp-package']"));
		
		MyUtility.selectDateByJS(driver, returningCalander, "12/15/2019");
		
		
		
		try {
			MyUtility.screenshot(driver, "/Users/mustafafaizy/eclipse-workspace/HomeProject/Screenshot", "ExpediaDate");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		driver.close();
		
		
		
	}

}
