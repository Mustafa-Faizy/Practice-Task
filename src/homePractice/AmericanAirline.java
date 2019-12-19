package homePractice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmericanAirline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("https://www.aa.com/homePage.do");
	
	// here im just moving the page a bit up.
	Actions action = new Actions(driver);
	
	//action.moveToElement(driver.findElement(By.xpath("//a[text()='Changes to checked bag fees and allowances']"))).build().perform();
	
// or for simplicit i can do this the below line of code and above line of code doese the same job.
	
	WebElement otherWay = driver.findElement(By.xpath("//a[text()='Changes to checked bag fees and allowances']"));
	action.moveToElement(otherWay).build().perform();


	
			
	WebElement from = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
	
	from.clear();
	from.sendKeys("Spa");
	
	
	List <WebElement> spainAirports = driver.findElements(By.xpath("//ul[@id='ui-id-3']/li"));
	
	System.out.println(spainAirports.size());
	
	for(WebElement portsElements: spainAirports) {
		
		if(portsElements.getText().contains("MAD")) {
			portsElements.click();
			break;
		}
	}
		
	
	WebElement to = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
	
	to.clear();
	to.sendKeys("Tex");
	
	List <WebElement> texasAirports = driver.findElements(By.xpath("//ul[@id='ui-id-4']/li"));
	
	System.out.println(texasAirports.size());
	
	for(WebElement texasPortsElements: texasAirports) {
		
		if(texasPortsElements.getText().contains("DFW")) {
			texasPortsElements.click();
			break;
		}
	}
	
	
	
	// number of passenger drop down is static drop down and for that we need to process it through the select class methods.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	}

}
