package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorSample extends Base{

	public static void main(String[] args) {

		JavaScriptExecutorSample javScript = new JavaScriptExecutorSample();
		javScript.initializeBrowser();
		javScript.verifyExecutor();

	}
	
	
	public void verifyExecutor()
	{
		//Pasting the code shared here
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		//Normally we click here. If click doesnt work, we can use the click function provided by java Script Interface
		// click() by JavaScript
		JavascriptExecutor js = (JavascriptExecutor)driver;  // creating reference for the Interface
		js.executeScript("arguments[0].click();", showMessageButton); // 'executeScript' is a method in this Interface. These 2 lines are predefined
		
		
		// To Scroll the Page - Scroll By by JavaScript
		js.executeScript("window.scrollBy(0,350)", "");  // 0 - x axis , 350 - y axis ; //(0, positive value ) - Scroll Down 
		js.executeScript("window.scrollBy(0,-350)", ""); //(0, negative value ) - Scroll Up ; 
				
		
		// To Scroll the Page - Scroll To by JavaScript
		
		//Write sample code
	}

}
