package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		}
	
	public void waitElements(By findBy) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.presenceOfElementLocated(findBy));
	}
	
	public void waitElementsClickable(By findBy) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
		wait.until(ExpectedConditions.elementToBeClickable(findBy));
	}
	
	public void waitElementsClickableVisibility(By findBy) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
	}
	
	public void waitElementsVisibility(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(9));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

}
