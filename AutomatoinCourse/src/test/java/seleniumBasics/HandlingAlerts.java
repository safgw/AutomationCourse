package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{

	public static void main(String[] args) 
	{
		HandlingAlerts alerts = new HandlingAlerts();
		alerts.initializeBrowser();
		//alerts.verifySimpleAlert();
		//alerts.verifyConfirmAlert();
		alerts.verifyPromptAlert();

	}
	
	
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		//Clicking the first button
		WebElement simpleAlert = driver.findElement(By.id("alertButton"));
		simpleAlert.click();
		
		//Move the control to the pop up
		Alert alert = driver.switchTo().alert(); // Now control switched to Alert popup
		alert.accept();  // Do not give click for pop ups
	}

	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement cnfirmAlert = driver.findElement(By.id("confirmButton"));
		cnfirmAlert.click();
		

		//Move the control to the pop up
		Alert alert = driver.switchTo().alert(); // Now control switched to Alert popup
		//Here we have 2 options - Ok and Cancel
		//alert.accept();  // To select OK
		alert.dismiss(); // To select Cancel
	}
	
	
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement prompt = driver.findElement(By.id("promtButton"));
		prompt.click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Alert text");
		alert.accept();
		
	}
	
}
