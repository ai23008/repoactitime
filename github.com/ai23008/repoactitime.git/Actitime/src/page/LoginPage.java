package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage{
	@FindBy(id="usename")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
        
	 public void setUN(String un) {
		 unTB.sendKeys(un);
	 }
	 public void setPW(String pw) {
		 pwTB.sendKeys(pw);
	 }
	 public void clickLGN() {
		 lgnbtn.click();
	 }
}
