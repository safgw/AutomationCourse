package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{

	public static void main(String[] args){
		HandlingActions allActions = new HandlingActions();
		allActions.initializeBrowser();
		//allActions.verifyRightClick();
		//allActions.mouseHover();
		//allActions.verifyDragAndDrop();
		
		try
		{
			allActions.verifyKeyBoardActions();
			}
		
		catch(AWTException e)
		{
			System.out.println("Error in keyboard actions");
		}
		
		
		
	}
	
	public void verifyRightClick()
	{
		WebElement rghtClick = driver.findElement(By.xpath("//a[text()='Home']"));
		
		//creating object for Action class, have to pass the driver
		Actions action = new Actions(driver);
		
		//Right click - contextClick()
		action.contextClick(rghtClick).build().perform();  // always to be followed with build().perform() , to execute the action
	}
		
		public void mouseHover()
		{
		
		//Mouse Hover
		WebElement mouseHover = driver.findElement(By.id("others"));
		// Here also Action class object is to be used
		Actions action = new Actions(driver);
		
		//Hover - moveToElement()
		action.moveToElement(mouseHover).build().perform();
			
		
	}
		
		public void verifyDragAndDrop()
		{
			driver.navigate().to("https://demoqa.com/droppable");
			
			//Need to create WebElements for Drag and Drop
			
			//WebElement for Drag Me
			WebElement dragMe = driver.findElement(By.id("draggable"));			
			
			//WebElement for Drop Me
			WebElement dropMe = driver.findElement(By.id("droppable"));
			
			Actions action = new Actions(driver);
			
			//Drag and Drop - dragAndDrop()		
			action.dragAndDrop(dragMe, dropMe).build().perform();
			
		}
		
		public void verifyKeyBoardActions() throws AWTException
		{	
			//Create object for Robot class
			
			Robot robot = new Robot();
			
			//To press a key - keyPress() . Keys are inside Key event class
			//VK = Virtual Key
			
			
			robot.keyPress(KeyEvent.VK_CONTROL); //_Control = Cntrl is pressed
			robot.keyPress(KeyEvent.VK_T);  //_T = T is pressed
			
			//Now Keys need to be released
			
			robot.keyRelease(KeyEvent.VK_CONTROL); //_Control = Cntrl is released
			robot.keyRelease(KeyEvent.VK_T);  //_T = T is released
			
			
		}
		

}
