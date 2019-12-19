package homePractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Expedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		
//		driver.get("https://www.expedia.com");
//		
//		WebElement citySearch = driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
//		
//		citySearch.clear();
//		citySearch.sendKeys("New York");
//		
//		List <WebElement> input = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']//li"));
//		
//		System.out.println(input.size());
//		
//		for(WebElement element: input) {
//			
//			if(element.getText().contains("SWF")) {
//				element.click();
//				break;
//			}
//		}
//		
//		
//		
//		WebElement goingTo = driver.findElement(By.id("package-destination-hp-package"));
//		
//		goingTo.clear();
//		goingTo.sendKeys("Los Angeles");
//		
//		List <WebElement> goingToInput = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']/div/li"));
//		
//		System.out.println(goingToInput.size());
//		
//		for(WebElement goingToInputElements: goingToInput) {
//	
//			if(goingToInputElements.getText().contains("MX")){
//				goingToInputElements.click();
//				break;
//			}
//
//		}
//		
//		
//		
//		
//		Select select = new Select(driver.findElement(By.xpath("//select[@id='package-advanced-preferred-class-hp-package']")));
//		
//		select.selectByVisibleText("First class");
//		

		
		// this was an example to show Muhib how it will work.
//		
//	List<WebElement> d = driver.findElements(By.tagName("select"));	
//	
//	for(WebElement i: d) {
//		if(i.getText().contains("Book"))
//			i.click();
//		break; 
//	}
//		
//		
		
		
	
		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.expedia.com");
		
		WebElement from = driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
		
		from.clear();
		from.sendKeys("New York");
		
		
		List<WebElement> airports = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']/div/li"));
		
		System.out.println(airports.size());
		
		for(WebElement element: airports) {
			
			if(element.getText().contains("JFK")) {
				element.click();
				break;
			}
		}
		
		WebElement to = driver.findElement(By.xpath("//input[@id='package-destination-hp-package']"));
		
		to.clear();
		to.sendKeys("Rich Mond");
		
		List <WebElement> destination = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']/div/li"));
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
