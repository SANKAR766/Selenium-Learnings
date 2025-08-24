package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
		
		
	WebElement firstname=driver.findElement(By.xpath("//*[@id='firstname']"));
	String value=firstname.getAttribute("title");
	System.out.println(value);
	
		
	}

}
