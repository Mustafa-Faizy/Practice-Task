package homePractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAlertPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi\\n");
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
		
		searchButton.click();
		
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.getTitle());
		
		
		driver.navigate().to("https://ksrtc.in/oprs-web/");
		
	WebElement operatorF = driver.findElement(By.xpath("//p[text()='Operator / Franchisee']"));
	
	operatorF.click();
		
	Set<String> windowHandle = driver.getWindowHandles();	
	
	Iterator <String> it = windowHandle.iterator();
	
	String parentWindow = it.next();
	
	
	String childWindow = it.next();
	
	driver.switchTo().window(childWindow);
	
	System.out.println(driver.getTitle());
		
	driver.close();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	driver.switchTo().window(parentWindow);
	
	System.out.println(driver.getTitle());
		
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.navigate().forward();
	System.out.println(driver.getTitle());
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
