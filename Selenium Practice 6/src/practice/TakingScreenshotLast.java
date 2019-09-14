package practice;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

  public class TakingScreenshotLast {

  public static void main(String[] args) throws Throwable
  {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\DIGITAL\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("http://Primusbank.qedgetech.com");
    driver.manage().window().maximize();
   
	TakesScreenshot ts =(TakesScreenshot)driver;
	File srcFile =ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(srcFile, new File("C:\\Users\\DIGITAL\\Desktop\\screenshot\\screen.png"));
	}

	}
