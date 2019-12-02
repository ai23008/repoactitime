package script;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Xl;
import page.LoginPage;

public class InvalidLogins extends Basetest {
	@Test
	public void validLogin() throws InterruptedException {
		int rc = Xl.getRowCount(XL_PATH, "InvalidLogins");
	for(int i=1;i<rc;i++)	{
	String un = Xl.getData(XL_PATH, "InvalidLogins", i, 0);
	String pw = Xl.getData(XL_PATH, "InvalidLogins", i, 1);
	//String title = Xl.getData(XL_PATH, "ValidLogin", 1, 2);
	LoginPage L=new LoginPage(driver);
	L.setUN(un);
	L.setPW(pw);
	L.clickLGN();
	Thread.sleep(2000);
	L.verifyerrmsgisDisplayed();}
	
}

}
