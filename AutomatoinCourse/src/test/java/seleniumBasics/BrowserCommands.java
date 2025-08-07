package seleniumBasics;

public class BrowserCommands extends Base{

	public static void main(String[] args) {
		BrowserCommands browser = new BrowserCommands();
		browser.initializeBrowser();
		//browser.handlingBrowserCommands();
      browser.navigationCommands();
	}
	
	public void handlingBrowserCommands()
	{
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String handleId = driver.getWindowHandle(); // Unique for each Window
		System.out.println(handleId);
		
		String pageSource = driver.getPageSource(); //to get Source code for the current page in the console
		System.out.println(pageSource);
	}
	
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/"); // From the current Obsqura indpw, it navigates to Amazon.in
		driver.navigate().back(); // Goes back to Obsqura from Amazon
		driver.navigate().forward(); // Goes back to Amazon from Obsqura
		driver.navigate().refresh();
	}
	

}
