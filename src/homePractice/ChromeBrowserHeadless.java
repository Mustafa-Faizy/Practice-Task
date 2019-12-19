package homePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		
		// creat object of chrome options
		ChromeOptions chromeOptions = new ChromeOptions();

		// add headless argument to chrome options object
	
		chromeOptions.addArguments("--headless");

		// instantiate chrome browser and pass the argument.
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// going to tek school page. and print out title'
		driver.get("https://tekschoolofamerica.com");
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
	}

}
