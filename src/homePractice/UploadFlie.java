package homePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFlie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url = ("http://xndev.com/display-image/");
		driver.get(url);
		
		
	// store choos file in a webElement object.
		
	WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));
		
		// we use sendKeys method to upload file in selenium.
							//sysntax. path of file/filname.ext  => if we are uploading a file that has extenssion of png we must ptovide that ext
																	// if we are uploading a file that is text has ext of txt we must provide that one
																	// if its exl file we must provide that extenssion.
		uploadFile.sendKeys("/Users/mustafafaizy/Desktop/nice picture.png");
		
		
		
		
		
		 
		
		
	}

}
