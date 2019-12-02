package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void verifyHomePageisDisplayed(WebDriver driver,int time,String title) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		try {wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("homepage is displayed",true);
	} catch(Exception e) {
		Reporter.log("homepage is not displayed",true);
	}
		}
}
