package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "input[class*='form-control ']")
	WebElement textBox;

	@FindBy(css = "button[type='submit']")
	WebElement continueButton;

	@FindBy(css = "input[aria-label*='Digit 1']")
	WebElement otpBox1;
	By otp = By.cssSelector("input[aria-label*='Digit 1']");

	// Action Methods
	public void phoneInput(String phone) {
		textBox.sendKeys(phone);
	}

	public void buttonContinue() {
		continueButton.click();
	}

	public void getOtp(String otpValues) throws AWTException {
		waitElements(otp);
		
		/*
		 * otpBox1.sendKeys("1"); otpBox2.sendKeys("2"); otpBox3.sendKeys("3");
		 * otpBox4.sendKeys("4"); otpBox5.sendKeys("5"); otpBox6.sendKeys("6");
		 */

		Robot robot = new Robot();

		StringSelection stringSelection = new StringSelection(otpValues);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		otpBox1.click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public boolean getInvalidOtp(String invalidotpValues) throws AWTException {
		waitElements(otp);
		
		/*
		 * otpBox1.sendKeys("1"); otpBox2.sendKeys("2"); otpBox3.sendKeys("3");
		 * otpBox4.sendKeys("4"); otpBox5.sendKeys("5"); otpBox6.sendKeys("6");
		 */

		Robot robot = new Robot();

		StringSelection stringSelection = new StringSelection(invalidotpValues);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		otpBox1.click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		return true;
	}

}
