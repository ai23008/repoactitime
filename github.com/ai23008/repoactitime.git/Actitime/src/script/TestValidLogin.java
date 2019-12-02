package script;




import org.testng.annotations.Test;

import generic.Basetest;
import generic.Xl;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class TestValidLogin  extends Basetest{
	@Test
	public void validLogin() {
		String un = Xl.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw = Xl.getData(XL_PATH, "ValidLogin", 1, 1);
		String title = Xl.getData(XL_PATH, "ValidLogin", 1, 2);
		LoginPage L=new LoginPage(driver);
		L.setUN(un);
		L.setPW(pw);
		L.clickLGN();
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyHomePageisDisplayed(driver, ETO, title);
		
	}

}
