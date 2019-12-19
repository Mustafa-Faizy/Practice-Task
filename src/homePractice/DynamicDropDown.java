package homePractice;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class DynamicDropDown {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addArguments("--headless");
		
		
			WebDriver driver = new ChromeDriver(chromeOptions);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("https://www.aa.com/homePage.do");
			
		
		
			
			// 1. grab the departure box xpath
			// 2. Store in a WebElment object
			// 3. Clear the box
			// 4. send (Wash) value
			// 5. create a list for storing webElments of dropdowns
			// 6. Create a for each loop to travel to list indexes
			// 7. write an if condition to click or select value we want
			// 8. break from the loop
			
			WebElement deaparture = driver.findElement(By.xpath("//input[@class='aaAutoComplete ui-autocomplete-input'and@id="
					+ "'reservationFlightSearchForm.originAirport']"));
			
			// i moved down here using Actions class method.
			Actions action = new Actions(driver);
			
			action.moveToElement(driver.findElement(By.xpath("//input[@name='_button_go']"))).build().perform();
			Thread.sleep(5000);
			
			deaparture.clear();
			deaparture.sendKeys("Wash");
		
			List <WebElement> airports = driver.findElements(By.xpath("//ul[@id='ui-id-3']/li"));
			
			System.out.println(airports.size());
			
			for(WebElement element: airports) {
				
			try {	if (element.getText().contains("BWI")) 
					element.click();
				break;
			 
			}catch(StaleElementReferenceException e){
			
				System.out.println("Element is no longer attached to dom");
				}
			}
		
		
			// 1. grab the destination box xpath
			// 2. Store in a WebElment object
			// 3. Clear the box
			// 4. send (Wash) value
			// 5. create a list for storing webElments of dropdowns
			// 6. Create a for each loop to travel to list indexes
			// 7. write an if condition to click or select value we want
			// 8. break from the loop

			
			
		WebElement destination = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport' "
				+ "and @name='destinationAirport']"));	
			
		destination.clear();
		destination.sendKeys("Las");
		
		
		List <WebElement> airports2 = driver.findElements(By.xpath("//ul[@id='ui-id-4']/li"));	
		
		System.out.println(airports2.size());
		
		for (WebElement element2: airports2) {
			
			if (element2.getText().contains("LAS")) {
				element2.click();
				break;
			}
		}
			
			
		WebElement staticDropDown = driver.findElement(By.xpath("//select[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
		
			Select select = new Select(staticDropDown);
			
			//select.selectByValue("2");
			
			//select.selectByIndex(1);
			
			select.selectByVisibleText("9");
			
			// storing deaparture date in a webelement obj
			WebElement deapartureCalandar = driver.findElement(By.xpath("//input[@id='aa-leavingOn']"));
			// selecting desire date JSExecutor class
			//Utility.selectDateByJS(driver, deapartureCalandar, "11/21/2019");
			
			WebElement returnCalendar = driver.findElement(By.xpath("//input[@id='aa-returningFrom']"));
			
			//Utility.selectDateByJS(driver, returnCalendar, "11/30/2019");
			
			
			
			
			
			
			MyUtility.screenshot(driver, "/Users/mustafafaizy/eclipse-workspace/HomeProject/Screenshot_HomePractice", "AmericanAirline Headless");
			
			
			
			driver.close();	
			
			
		
			
			
			
			 
			
			
			
			
		
		
		
	}

}
