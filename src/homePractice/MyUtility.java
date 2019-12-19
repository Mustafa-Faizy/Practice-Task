package homePractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyUtility {

	
	
	public static void screenshot(WebDriver driver, String locationOfFile, String fileName) throws IOException {
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(locationOfFile+fileName+".png"));
		
		
	}
	
		
		
	public static void selectDateByJS(WebDriver driver, WebElement element, String date) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
		
	}
		
		
		
		
		
		
		
		
	
	

	
	
}
