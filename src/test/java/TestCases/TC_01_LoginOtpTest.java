package TestCases;

import java.awt.AWTException;
import java.time.Duration;

import org.testng.annotations.Test;
import PageObjects.LoginPage;
import TestBase.BaseClass;

public class TC_01_LoginOtpTest extends BaseClass {

	@Test(priority=0)
	public void test_LoginFailed() throws InterruptedException, AWTException {

		LoginPage lp = new LoginPage(driver);
		lp.phoneInput(rb.getString("phone"));
		Thread.sleep(3000);
		lp.buttonContinue();
		Thread.sleep(3000);
		lp.getOtp(rb.getString("invalidOtp"));
		System.out.println("Invalid otp detected");
	}
	@Test(priority=1)
	public void test_LoginSuccess() throws InterruptedException, AWTException {

		LoginPage lp = new LoginPage(driver);
//		lp.phoneInput(rb.getString("phone"));
//		Thread.sleep(3000);
//		lp.buttonContinue();
//		Thread.sleep(3000);
		lp.getOtp(rb.getString("otpValue"));
		System.out.println("Valid otp detected");
	}

}
