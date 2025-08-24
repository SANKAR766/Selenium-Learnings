package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/broken-links.php");
		
		
		WebElement Brokenlink=driver.findElement(By.partialLinkText("Broken Link"));
		String redirect=Brokenlink.getAttribute("href");
		System.out.println("The link is redirected to " + redirect);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
	int values=	links.size();
	System.out.println(values);
	
	
	WebElement errorpage=driver.findElement(By.partialLinkText("Broken Link"));
	errorpage.click();
	
	String titlename=driver.getTitle();
	if(titlename.contains("Broken Link")) {
		System.out.println("The link is broken");
		
	}
	
	
	

	}

}
