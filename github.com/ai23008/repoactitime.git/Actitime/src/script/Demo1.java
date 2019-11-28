package script;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basetest;

public class Demo1 extends Basetest {

	@Test
	public void testA(){
		try{driver.findElement(By.id("username")).sendKeys("admin");
		Reporter.log("username is working",true);
		}catch(Exception e){
			Reporter.log("username is not working",true);
		}
		
	}
}
