package seleniumConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		WebElement window=driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]"));
		window.click();
		
		Thread.sleep(5000);
		String  oldwindow=driver.getWindowHandle();
		
	Set<String> allwindows=	 driver.getWindowHandles();
	
	for (String newwindow : allwindows) {
		
		driver.switchTo().window(newwindow);
		
	}
		
		WebElement newwindow=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		newwindow.sendKeys("Automation"+Keys.ENTER);
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		WebElement multiplewin=driver.findElement(By.xpath("//*[@id=\"newTabBtn\"]"));
		multiplewin.click();
		Set<String> multi=driver.getWindowHandles();
		for (String newlyopened : multi) {
			if(newlyopened.equals(oldwindow)) {
				driver.switchTo().window(newlyopened);
				driver.close();
				
			}
		}
		
		
		
	}

}
