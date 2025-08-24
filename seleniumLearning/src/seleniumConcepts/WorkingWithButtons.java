package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		
		
		WebElement firstbutton=driver.findElement(By.xpath("//button[@type='button'][@class='btn btn-primary']"));
		Point point=firstbutton.getLocation();
		int  xpoint=point.getX();
		int ypoint=point.getY();
		System.out.println("The xpoint " + xpoint + "The ypoint " + ypoint);
		
		
		
		WebElement secondbutton=driver.findElement(By.xpath("//button[@type='button'][@class='btn btn-secondary']"));
		String value=secondbutton.getCssValue("background-color");
		System.out.println(value);
		
		WebElement thirdbutton=driver.findElement(By.xpath("//button[@type='button'][@class='btn btn-secondary']/following::*"));
		int height=thirdbutton.getSize().getHeight();
		int width=thirdbutton.getSize().getWidth();
		System.out.println("The height  " + height + "The width " + width);
		
		
	}

}
