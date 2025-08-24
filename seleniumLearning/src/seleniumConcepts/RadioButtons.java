package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		
	
		WebElement radiobutton1=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input"));
		Thread.sleep(7000);
		radiobutton1.click();
		
		
	}

}
