package TestBase;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import PageObjects.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
//import PageObjects.IntroductionPage;

public class BaseClass {
	
	public WebDriver driver;
	public ResourceBundle rb;
	public Logger logger;
	

	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		WebDriverManager.chromedriver().setup();
		rb = ResourceBundle.getBundle("config");
		logger=LogManager.getLogger(this.getClass());
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		
		if (br.equals("chrome")) {
			driver = new ChromeDriver(options);
		} else if (br.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.get(rb.getString("baseUrl")); // get url from config.properties file 
		driver.manage().window().maximize();	
		
	}		

//	@AfterClass
//	public void teardown() {
//		driver.quit();
//	}
//	
	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//Screenshots//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//Screenshots//" + testCaseName + ".png";
		
		
	}

}
