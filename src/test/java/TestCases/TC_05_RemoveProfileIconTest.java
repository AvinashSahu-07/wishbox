package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.Signup;
import PageObjects.EditProfile;
import TestBase.BaseClass;

public class TC_05_RemoveProfileIconTest extends BaseClass {
	@Test(priority=0)

	public void test_RemoveCoverIcon() throws InterruptedException, AWTException {

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.phoneInput(rb.getString("phone")); // phone value getting it from properties file
		lp.buttonContinue();
		Thread.sleep(3000);
		lp.getOtp(rb.getString("otpValue"));
		Thread.sleep(2000);
				
		/*EditProfile profile=new EditProfile(driver);
		Thread.sleep(3000);
		profile.clickEditProfile();
		Thread.sleep(3000);
		profile.removeProfileIcon();
		Thread.sleep(2000);
		profile.clickSave();
		Thread.sleep(4000);*/
		
		EditProfile profile=new EditProfile(driver);
		Thread.sleep(4000);
		profile.clickEditProfile();
		Thread.sleep(4000);
		profile.removeCoverIcon();
		Thread.sleep(2000);
		profile.clickSave();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void test_RemoveProfileIcon() throws InterruptedException, AWTException {

		/*EditProfile profile=new EditProfile(driver);
		Thread.sleep(4000);
		profile.clickEditProfile();
		Thread.sleep(4000);
		profile.removeCoverIcon();
		Thread.sleep(2000);
		profile.clickSave();
		Thread.sleep(2000);	*/
		EditProfile profile=new EditProfile(driver);
		Thread.sleep(3000);
		profile.clickEditProfile();
		Thread.sleep(3000);
		profile.removeProfileIcon();
		Thread.sleep(2000);
		profile.clickSave();
		Thread.sleep(4000);
	}
	
}
