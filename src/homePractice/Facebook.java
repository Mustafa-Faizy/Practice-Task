package homePractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		// manage commands
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		String url = "https://web.facebook.com";
		driver.get(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mustafa.faizy89@yahoo.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mustafafaizy?????%%%%%0071995");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
		// after what i missed in sunday class.
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for(WebElement i: link) {
			String elementText = i.getText();
			System.out.println(elementText);
			
		}
		// clicking the rectangle looking dropdown.
		driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
