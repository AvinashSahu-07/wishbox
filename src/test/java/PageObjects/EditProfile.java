package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfile extends BasePage {

	public EditProfile(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Edit profile']")
	WebElement editProfileButton;
	
	@FindBy(id = "upload-profile")
	WebElement uploadButton;
	
	@FindBy(id = "upload-cover-input")
	WebElement uploadCover;
	
	@FindBy(xpath = "//button[@type='button' and contains(., 'Save')]")
	WebElement savePictureButton;
	
	@FindBy(xpath = "//button[@type='submit' and contains(., 'Save')]")
	WebElement saveButton;
	
	@FindBy(xpath = "(//button[@class='text-btn'][normalize-space()='Remove'])[1]")
	WebElement removeProfileButton;
	
	@FindBy(xpath = "(//button[@class='text-btn'][normalize-space()='Remove'])[2]")
	WebElement removeCoverButton;
	
	@FindBy(css="input[placeholder='Enter your full name']")
	WebElement nameInputField;
	
	@FindBy(id="description")
	WebElement nameDescriptionField;
	
	
	
	public void clickEditProfile() {
		editProfileButton.click();
	}
	public void uploadProfileIcon() {
		uploadButton.sendKeys(System.getProperty("user.dir")+ "\\Files\\kashmiri_kahwa.jpg");
	}
	public void clickPictureSave() {
		savePictureButton.click();
	}
	public void clickSave() {
		saveButton.click();
	}
	public void uploadCoverIcon() {
		uploadCover.sendKeys(System.getProperty("user.dir")+ "\\Files\\Profilepic.jpg");
	}
	public void removeProfileIcon() {
		removeProfileButton.click();
	}
	public void removeCoverIcon() {
		removeCoverButton.click();
	}
	public void addName() {
		nameInputField.clear();
		nameInputField.sendKeys("Automation user");
	}
	public void addDescription() {
		nameInputField.clear();
		nameDescriptionField.sendKeys("Automation user tested by Selenium");
	}
	public void removeName() {
		nameInputField.clear();
	}
	public void removeDescription() {
		nameDescriptionField.clear();
	}
	
	

}
