package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithCalendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		
		WebElement calendar=driver.findElement(By.xpath("//*[@type='text']"));
		calendar.click();
		
		
		WebElement DOB =driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/span[25]"));
		
		DOB.click();
		

    
    
    



		
		
	}

}
