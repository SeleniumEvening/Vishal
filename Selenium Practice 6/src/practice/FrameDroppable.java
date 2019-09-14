package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDroppable {

	private static String frame1;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DIGITAL\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        
        //By Index
        
        List<WebElement> frames=driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());
        driver.switchTo().frame(0);
        
       //By String
        
        driver.switchTo().frame(driver.findElement(By.xpath("//[@id='countent']/iframe")));
        
        //By WebElement
        
        WebElement frame1=driver.findElement(By.xpath("//[@id='content']/iframe"));
		driver.switchTo().frame(frame1); 
		
		//Drag And Drop Operation
		
		WebElement drg=driver.findElement(By.id("draggable"));
		WebElement drp=driver.findElement(By.id("droppable")); 
		
		Actions dAd=new Actions(driver);
		
		dAd.dragAndDrop(drg, drp).build().perform();
		
		//Giving the Focus to Default Page
		
	    driver.switchTo().defaultContent(); 

	}

}
