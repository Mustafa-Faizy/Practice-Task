package homePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyExpWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
	
	WebDriver driver =  new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	
	driver.get("https://www.facebook.com");
	
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	wait.until(ExpectedConditions.textToBePresentInElement
			(driver.findElement(By.xpath("//div[text()='It’s quick and easy.']")), "It’s quick and easy."));
	
	
		WebElement element = driver.findElement(By.xpath("//div[text()='It’s quick and easy.']"));
		
		System.out.println(element.getText());
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='u_0_w']"))));
		
		WebElement signeUp = driver.findElement(By.xpath("//button[@id='u_0_w']"));
		
		signeUp.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
