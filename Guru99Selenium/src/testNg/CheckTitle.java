package testNg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import atu.testrecorder.exceptions.ATUTestRecorderException;
import mainClass.TestCaseOne;

public class CheckTitle {

	public WebDriver driver;

	/**
	 * 
	 * @return Data provider, is for create a object for sent different values to
	 *         input in a test case.
	 */
	@DataProvider
	public Object data() {

		Object[][] obj = new Object[3][2];

		// Valid login and password
		obj[0][0] = Guru99Statics.Util.LOGIN_ID;
		obj[0][1] = Guru99Statics.Util.PASSWORD;

		// Second data scenario Valid login and invalid password

		obj[1][0] = Guru99Statics.Util.LOGIN_ID;
		obj[1][1] = "WrongPassword123";

		// Third data scenario invalid login and valid password

		obj[2][0] = "Third ID provided";
		obj[2][1] = Guru99Statics.Util.PASSWORD;

		return obj;

	}

	/**
	 * 
	 * @param login
	 * @param password
	 * @throws ATUTestRecorderException
	 * @throws InterruptedException
	 * 
	 *                                  This method will receive data from
	 *                                  dataProvider, which will sent three
	 *                                  different values to check the login page
	 *                                  (VALID - NOT VALID - NOT VALID)
	 */
	@Test(dataProvider = "data")
	public void checkTitleGuru99(String login, String password) throws ATUTestRecorderException, InterruptedException {

		driver = new FirefoxDriver();

		String expected = "Guru99 Bank Manager HomePage";

		// running test case one
		TestCaseOne obj = new TestCaseOne();
		obj.openingWeb(driver);
		obj.sendKeys(driver, login, password);

		obj.manageId(driver, login);

		String title = obj.chekingTitle(driver);

		assertEquals(title, expected);

		// Running test case two

		/**
		 * TestCaseOne obj3 = new TestCaseOne();
		 * 
		 * String title = obj3.chekingTitle(driver);
		 * 
		 * 
		 * System.out.println(title); Assert.assertEquals(title, expected);
		 * driver.close();
		 **/
	}
}
