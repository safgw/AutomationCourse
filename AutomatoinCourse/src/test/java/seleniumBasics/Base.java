package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	
		public static void main(String[] args) 
		{
			Base base = new Base();
			base.initializeBrowser();
			base.closeAndQuit();

		}		
		
		public void initializeBrowser()
		{
			driver = new ChromeDriver(); // FirefoxDriver or EdgeDriver
			//driver = new FirefoxDriver();
			//driver = new EdgeDriver();
			driver.get("https://selenium.qabible.in/");
			driver.manage().window().maximize();  // To maximize
		}
		
		public void closeAndQuit()
		{
			//driver.close();
			//driver.quit();
		}

}
