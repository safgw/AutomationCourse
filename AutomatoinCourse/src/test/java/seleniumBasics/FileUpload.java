package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement file=driver.findElement(By.id("uploadfile_0"));
		file.sendKeys("C:\\Users\\himaa\\git\\AutomationCourse\\AutomatoinCourse\\src\\test\\resources\\Assignment_HashSet.pdf");
		WebElement checkBox=driver.findElement(By.id("terms"));
		checkBox.click();
		WebElement bttn=driver.findElement(By.id("submitbutton"));
		bttn.click();
		}
	
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement btn=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		btn.click();
		
		//create object for StringSelection class and provide the file path as argument
		StringSelection s=new StringSelection("C:\\Users\\himaa\\git\\AutomationCourse\\AutomatoinCourse\\src\\test\\resources\\Assignment_HashSet.pdf");
		
		//Toolkit class is called to get the copied content from clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		
		//obj for Robot class
		Robot robot=new Robot();
		
		// set waiting time(ms)
		
		robot.delay(2500);
		
		//first click enter then release->ctrl+v->release->enter ->release --to paste the path
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload upload=new FileUpload();
		upload.initializeBrowser();
		//upload.fileUploadUsingSendKeys();
		
		
		try {
			upload.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}