package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{

	public static void main(String[] args) {
		
		HandlingTable table = new HandlingTable();
		table.initializeBrowser();
		table.verifyTable();
		
	}
	
	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		
		// To get data of the entire table
		WebElement table = driver.findElement(By.id("dataTable"));
		System.out.println(table.getText());
		
		// To get data of a particular row in the table  - XpathOf<table>/tbody/tr[Row No:]
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tableRow.getText());
	}

}
