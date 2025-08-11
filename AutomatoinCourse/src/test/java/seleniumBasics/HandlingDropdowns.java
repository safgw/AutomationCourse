package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends Base{

	public static void main(String[] args) 
	{
		HandlingDropdowns drop = new HandlingDropdowns();
		drop.initializeBrowser();
	//	drop.handlingDropdowns();
	//	drop.handlingCheckBox();
		drop.handlingRadioButton();
		
		

	}

	
	public void handlingDropdowns()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDwn = driver.findElement(By.id("dropdowm-menu-1")); 
		
		Select select = new Select(dropDwn);  // This is the object created for the select Class
		
		//Select by ID	
		//select.selectByIndex(2);
		
		
		//Select by Index
		//select.selectByValue("sql");
		
		//Select by Visible Text
		select.selectByVisibleText("C#");
		
		
	}
	
	

	public void handlingCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement chckBox3 = driver.findElement(By.xpath("//input[@value='option-3']")); 
		chckBox3.click();
		WebElement chckBox1 = driver.findElement(By.xpath("//input[@value='option-1']")); 
		chckBox1.click();		
		System.out.println(chckBox1.isSelected());
		
	}
	
	
	

	public void handlingRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement radioBttn3 = driver.findElement(By.xpath("//input[@value='yellow']")); 
		radioBttn3.click();
		WebElement radioBttn1 = driver.findElement(By.xpath("//input[@value='blue']")); 
		radioBttn1.click();
		System.out.println(radioBttn1.isSelected());
	}
	
	
	
}
