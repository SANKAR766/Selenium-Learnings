package seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
			

		
		WebElement alert1=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button"));
		alert1.click();
        Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		
		
		WebElement confirmalert=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button"));
		confirmalert.click();
	    Alert confirm=driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(5000);
		
		WebElement promptalert=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/button"));
		promptalert.click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("Hello");
		prompt.accept();
		
		
		
		
	}

}
