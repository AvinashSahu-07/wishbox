package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.Signup;
import PageObjects.EditProfile;
import TestBase.BaseClass;

public class TC_04_UploadProfileIconTest extends BaseClass {
	@Test(priority=0)

	public void test_UploadProfileIcon() throws InterruptedException, AWTException {

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
		Thread.sleep(3000);
		profile.uploadProfileIcon();
		Thread.sleep(3000);
		profile.clickPictureSave();
		Thread.sleep(2000);
		profile.clickSave();
		Thread.sleep(2000);		
	}
	
	@Test(priority=1)
	public void test_UploadCoverIcon() throws InterruptedException, AWTException {

		EditProfile profile=new EditProfile(driver);
		Thread.sleep(3000);
		profile.clickEditProfile();
		Thread.sleep(3000);
		profile.uploadCoverIcon();;
		Thread.sleep(3000);
		profile.clickPictureSave();
		Thread.sleep(2000);
		profile.clickSave();
		Thread.sleep(2000);		
	}
	
}
