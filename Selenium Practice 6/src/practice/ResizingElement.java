package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizingElement {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DIGITAL\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://jqueryui.com/resizable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        
        WebElement rs=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
        Actions resize=new Actions(driver);
        
        resize.clickAndHold(rs).moveByOffset(250, 150).release(rs).build().perform();
        

	}

}
