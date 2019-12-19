package homePractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownBySelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		
		
System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.expedia.com");
		
		WebElement departureFrom = driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
		
		departureFrom.clear();
		departureFrom.sendKeys("Wash");
		
		List <WebElement> fromAirport = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']/div/li"));
		
		System.out.println(fromAirport.size());
		
		for(WebElement i: fromAirport) {
			
			if(i.getText().contains("BWI")) {
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
