package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.Signup;
import PageObjects.EditProfile;
import TestBase.BaseClass;

public class TC_06_EditNameAndDecriptionTest extends BaseClass {
	@Test(priority=0)

	public void test_AddNameDescription() throws InterruptedException, AWTException {

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(3000);
		lp.phoneInput(rb.getString("phone")); // phone value getting it from properties file
		lp.buttonContinue();
		Thread.sleep(3000);
		lp.getOtp(rb.getString("otpValue"));
		Thread.sleep(2000);
				
		EditProfile profile=new EditProfile(driver);
		Thread.sleep(3000);
		profile.clickEditProfile();
		profile.addName();
		Thread.sleep(2000);
		profile.addDescription();
		profile.clickSave();
			
	}
	
	@Test(priority=1)
	public void test_RemoveNameDesciption() throws InterruptedException, AWTException {

		EditProfile profile=new EditProfile(driver);
		Thread.sleep(3000);
		profile.clickEditProfile();
		profile.removeName();
		Thread.sleep(2000);
		profile.removeDescription();
		profile.clickSave();
		
	}
	
}
