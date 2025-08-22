package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;
import pages.LoginPage;


public class LoginTest extends TestNGBase
{

	@Test
	public void verifyUserLoginWithValidCredential()
	{		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField();
		loginPage.enterPasswordOnPasswordField();
		loginPage.clickOnLoginButton();
		
		//WebElement userNameField = driver.findElement(By.id("user-name"));
		//userNameField.sendKeys("standard_user");
		
		//WebElement passwordField = driver.findElement(By.id("password"));
		//passwordField.sendKeys("secret_sauce");
				
		//WebElement loginButton = driver.findElement(By.id("login-button"));
		//loginButton.click();
			
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
