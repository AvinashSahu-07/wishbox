package TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import Utilities.DataReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.Signup;
import TestBase.BaseClass;

public class TC_03_SignupDDT extends BaseClass{
	
	
	@Test(priority=0)
	public void test_UserLogin() throws InterruptedException, AWTException {

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.phoneInput(rb.getString("phoneDDT")); // phone value getting it from properties file
		lp.buttonContinue();
		Thread.sleep(3000);
		lp.getOtp(rb.getString("otpValue"));
		Thread.sleep(2000);
	}
	
	
	@Test(dataProvider="SignupData",priority=1)
	public void test_signupDataDrivenTest(HashMap<String,String> input) throws InterruptedException, AWTException {
		
		/*LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.phoneInput(rb.getString("phoneDDT"));
		lp.buttonContinue();
		Thread.sleep(3000);
		lp.getOtp(rb.getString("otpValue"));
		Thread.sleep(2000);*/
		
		Signup sign=new Signup(driver);
		sign.nameInput(input.get("name"));
		sign.emailInput(input.get("email"));
		sign.clickSignup();
		Thread.sleep(2000);
		sign.clearInput();
	}
	
	@DataProvider
	public Object[][] SignupData() throws IOException
	{

		DataReader dr=new DataReader();
		List<HashMap<String,String>> data = dr.getJsonData(System.getProperty("user.dir")+"//src//test//java//TestData//SignupData.json");
		return new Object[][]  {{data.get(0)}, {data.get(1) },{data.get(2)} };
		
	}

}
