package mainClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TestCaseMainGuru99 {

	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException {

		Thread.sleep(3000);
		// initialization
		WebDriver driver = new FirefoxDriver();

		// initialization

		TestCaseOne open = new TestCaseOne();
		open.openingWeb(driver);

		Thread.sleep(3000);

		// Sending keys and clicking logging button
		TestCaseOne keys = new TestCaseOne();
		keys.sendKeys(driver, Guru99Statics.Util.LOGIN_ID, Guru99Statics.Util.PASSWORD);

		Thread.sleep(5000);

		// Checking page title (second task)
		TestCaseOne title = new TestCaseOne();
		title.chekingTitle(driver);

		Thread.sleep(2000);

		driver.quit();

	}

}
