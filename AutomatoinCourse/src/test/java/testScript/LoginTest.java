package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import automationCore.TestNGBase;
import net.bytebuddy.asm.Advice.Argument;

public class LoginTest extends TestNGBase
{

	@Test
	public void verifyUserLoginWithValidCredential() throws AWTException
	{		
		WebElement userNameField = driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user");
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");
				
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();


			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);   // move focus
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER); // press Enter
			robot.keyRelease(KeyEvent.VK_ENTER);
		
				
	}
	
	
	@Test
	public void verifyUserLoginWithValidUserNameAndInvalidPassword()
	{		
		WebElement userNameField = driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user");
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce1");
				
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}
	
	
	@Test
	public void verifyUserLoginWithInvalidUserNameAndValidPassword()
	{		
		WebElement userNameField = driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user1");
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");
				
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}
	
	
	@Test
	public void verifyUserLoginWithInvalidCredential()
	{		
		WebElement userNameField = driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user1");
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce1");
				
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}
	
	
	@Test
	public void verifyUserLoginWithBlankCredentials()
	{		
				
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}
	
		
}
