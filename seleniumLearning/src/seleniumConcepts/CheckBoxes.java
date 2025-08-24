package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
	
	
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"c_bs_1\"]"));
		checkbox1.click();
		Thread.sleep(7000);
		
		boolean selected=checkbox1.isSelected();
		checkbox1.click();
		System.out.println(selected);
	}
	

}
