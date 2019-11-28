package generic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Autolib {
	public static void getphoto(WebDriver driver,String path) {
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		//FileUtils.copyFile(src,dest);
	}

}
