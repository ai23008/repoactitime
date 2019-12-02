package script;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Xl;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class Invalidlogin extends Basetest{

	@Test
	public void validLogin() throws InterruptedException {
		String un = Xl.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw = Xl.getData(XL_PATH, "ValidLogin", 1, 1);
		String title = Xl.getData(XL_PATH, "ValidLogin", 1, 2);
		LoginPage L=new LoginPage(driver);
		L.setUN(un);
		L.setPW(pw);
		L.clickLGN();
		Thread.sleep(2000);
		L.verifyerrmsgisDisplayed();
		
	}
}
