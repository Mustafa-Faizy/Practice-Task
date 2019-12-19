package homePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		
		// manage commands.
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.skype.com");
		
		String title = driver.getTitle();
		//System.out.println("=> " + title);
		
		String expectedTitle = "Skype | Communication tool for free calls and chat";
		
		if(title.equalsIgnoreCase(expectedTitle)) {
			System.out.println(title);
		}
		else {
			System.out.println("Wrong title");
		}
		
		WebElement obj = driver.findElement(By.xpath("//span[text()='Sign in']"));
		 
		obj.click();
		obj.findElement(By.xpath("//a[@data-bi-id='my-account']")).sendKeys(Keys.ENTER); //.click();
		
		System.out.println(obj.getText());
		System.out.println(obj.isDisplayed());
		
		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("8176531270");
		driver.findElement(By.xpath("//input[@class='btn btn-block btn-primary']")).click();
		
		driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("oldisgold1990");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		// here click on reset the password
		driver.findElement(By.xpath("//a[text()='reset it now.']")).click();
		
		driver.findElement(By.xpath("//input[@id='iSelectProofAction']")).click();
		// Microsoft send Verification code on phone
		driver.findElement(By.xpath("//input[@id='iVerifyText']")).sendKeys("4271686");
		
		driver.findElement(By.xpath("//input[@id='iVerifyIdentityCancel']")).click();
		
		
		
		
		
		
		
	}

}
