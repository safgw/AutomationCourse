package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	public static void main(String[] args) 
	{
		HandlingFrames frames = new HandlingFrames();
		frames.initializeBrowser();
		frames.verifyFrames();
	}
	
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		
		//size()  // to get the count of all the frames in the DOM
		List<WebElement> totalFrame = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrame.size());
		
		//switchTo().frame(); // To bring control to the required Frame
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		
		
		WebElement frameheading = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameheading.getText());
		
		
		// switchTo().defaultContent()  // back to previous control
		driver.switchTo().defaultContent();
		
		
	}

}
