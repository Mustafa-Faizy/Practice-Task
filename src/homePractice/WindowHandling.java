package homePractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi\\\\n");
		
		WebElement goButton = driver.findElement(By.xpath("//input[@type='submit']"));
		
		goButton.click();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.getTitle()); // until we dont handle the alert we cant do anything in that page.
		
		
		
		driver.navigate().to("https://ksrtc.in/oprs-web/");
		
		WebElement franchiseOperator = driver.findElement(By.xpath("//p[text()='Operator / Franchisee']"));
		
		franchiseOperator.click();
		
		Set <String> windowHanlde = driver.getWindowHandles();
		
		Iterator <String> it = windowHanlde.iterator();
		
		String parentindow = it.next();
		
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentindow);
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
