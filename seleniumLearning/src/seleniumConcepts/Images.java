package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/broken-images");
		
		WebElement image1=driver.findElement(By.xpath("//*[@id=\"core\"]/div/div/div/div[1]/img"));
		

		if(image1.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
		}else {
			System.out.println("NOT broken");
		}
		
		
	}

}
