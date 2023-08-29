package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;
import PageObjects.LoginPage;
import PageObjects.Signup;
import TestBase.BaseClass;

public class TC_02_SignupTest extends BaseClass {
	@Test
	public void test_UserSignup() throws InterruptedException, AWTException {

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.phoneInput(rb.getString("phone")); // phone value getting it from properties file
		lp.buttonContinue();
		Thread.sleep(3000);
		lp.getOtp(rb.getString("otpValue"));
		Thread.sleep(2000);
				
		Signup sign=new Signup(driver);
		sign.nameInput(rb.getString("name"));
		sign.emailInput(rb.getString("email"));//(
		sign.clickSignup();		
		
	}

}
