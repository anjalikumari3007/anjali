package WebDriver;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import sun.net.ftp.FtpDirEntry.Type;

public class WebDriver_Utility {

	public static void scrollToWebElement(WebDriver driver, WebElement elements) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguements[0].scrollIntoView(true)", elements);

	}

	public static void takesScreenshotOfWebPage(WebDriver driver, String ssName) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/screenshot/" + ssName + ".png");

		try {

			FileHandler.copy(src, dest);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static String getScreenShotPath(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot) driver;
  	  String path = ts.getScreenshotAs(OutputType.BASE64);
  	  return path;
	}

}
