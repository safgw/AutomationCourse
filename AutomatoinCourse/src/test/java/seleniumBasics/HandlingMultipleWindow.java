package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow extends Base{
	
	

	public static void main(String[] args) {
		HandlingMultipleWindow multiWindow1 = new HandlingMultipleWindow();
		multiWindow1.initializeBrowser();;
		multiWindow1.verifyMultipleWindow();
	}
	
	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindowHandle = driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		// We cannot perform the same to get the handle id of the 2nd window
		
		//String secondWindowHandle = driver.getWindowHandle();
		//System.out.println(secondWindowHandle);
		
		Set<String> handleIds = driver.getWindowHandles();// To get the handle IDs of more than one windows
		
		System.out.println(handleIds);
		
		//Iterator operator for Set
		
		Iterator<String> itr = handleIds.iterator();
		while(itr.hasNext())
		{
			
			String currentId = itr.next(); // This stores the id of the second window
					
			if(!currentId.equals(firstWindowHandle))
			{
				driver.switchTo().window(currentId);
				
				WebElement email= driver.findElement(By.name("emailid"));
				email.sendKeys("abc@gmail.com");
				
				WebElement submit= driver.findElement(By.name("btnLogin"));
				submit.click();
			}
		}

	}


}
