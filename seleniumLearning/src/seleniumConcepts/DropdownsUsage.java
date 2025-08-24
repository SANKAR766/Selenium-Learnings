package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='dropdown']"));
	   boolean enabled=	dropdown1.isEnabled();
	    System.out.println(enabled);
		//Select select1=new Select(dropdown1);
		//select1.selectByIndex(0);
		
		WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\"elementsPerPageSelect\"]"));
		Select select2=new Select(dropdown2);
		select2.selectByVisibleText("100");
		List<WebElement> listofoptions=select2.getOptions();
		int values=listofoptions.size();
		System.out.println(values);
		
		WebElement dropdown3=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		dropdown3.sendKeys("India");
		dropdown3.click();
		
		
		
	}

}
