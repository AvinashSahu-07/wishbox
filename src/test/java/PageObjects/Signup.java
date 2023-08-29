package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup extends BasePage {

	public Signup(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "name")
	WebElement nameInputField;	
	By inputName=By.cssSelector("input[id='name']");
	
	@FindBy(id = "email")
	WebElement emailInputField;
	
	@FindBy(css = "button[type='submit']")
	WebElement signupButton;
	
	
	
	public void nameInput(String name) {
		nameInputField.sendKeys(name);
	}
	public void emailInput(String email) {
		emailInputField.sendKeys(email);
	}
	
	public void clickSignup() {
		signupButton.click();
	}
	public void clearInput() {
		nameInputField.clear();
		emailInputField.clear();
	}
	public void refresh() {
		driver.navigate().refresh();
	}

}
