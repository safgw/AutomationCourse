package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {

	public static void main(String[] args) {
		
		WebElementCommands webElmnt = new WebElementCommands();
		webElmnt.initializeBrowser();
		webElmnt.handlingElements();

	}
	
	public void handlingElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		//sendKeys()
		WebElement msgBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgBox.sendKeys("Input Form");
		
		//click()
		WebElement bttn = driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(bttn.isDisplayed());
		System.out.println(bttn.isEnabled());
		bttn.click();
		
		
		//getText()
		WebElement msg = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(msg.getText()); // o/p - Your Message : Input Form
		
		//clear()
		msgBox.clear();
		
		//getCSSValue()
		System.out.println(bttn.getCssValue("background-color")); // o/p = rgba(0, 105, 217, 1)
		
		//getTagName()
		WebElement value = driver.findElement(By.id("value-a"));
		System.out.println(value.getTagName()); // o/p - input
		
	}

}
