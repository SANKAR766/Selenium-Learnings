package seleniumConcepts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DownloadAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		
		
		WebElement downloadbutton=driver.findElement(By.xpath("//*[@id=\"downloadButton\"]"));
		
	    downloadbutton.click();
	    
	    File filelocation=new File("C:\\Users\\SANKAR\\Downloads");
	    
	    File[] files= filelocation.listFiles();
	    
	    for (File file : files) {
			
	    	if(file.getName().equals("sampleFile.jpeg")) {
	    		System.out.println("The file is present in downloads");
	    		break;
	    		
		}
	   		 
		
	}
	    		
	}
}
