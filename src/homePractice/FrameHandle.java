package homePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		// swithch to frame.
		//driver.switchTo().frame("main");
		//driver.switchTo().frame("//frame[@name='main']");
		
		WebElement headerFrame = driver.findElement(By.xpath("//frame[@name='main']"));
		
		driver.switchTo().frame(headerFrame);
		
		WebElement header = driver.findElement(By.xpath("//h2[text()='Title bar']"));
		
		System.out.println(header.getText());
		
		// now im out of frame or switching to default page
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame("bot");
		
		WebElement footer = driver.findElement(By.xpath("//h2[contains(text(),'Title bar')]"));
				
		System.out.println(footer.getText());
		
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
