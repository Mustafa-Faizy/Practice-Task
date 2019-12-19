package homePractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowserHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.gecko.drive", "C:\\geckodriver");
		
		// creat firefox options object
		
		FirefoxOptions fo = new FirefoxOptions();
		
		fo.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(fo);
		
		
		driver.get("https://tekschoolofamerica.com");
		System.out.println(driver.getTitle());
													// need to figure out the screenshot
		try {
			MyUtility.screenshot(driver," /Users/mustafafaizy/eclipse-workspace/HomeProject/Screenshot","firefox headless pic");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
