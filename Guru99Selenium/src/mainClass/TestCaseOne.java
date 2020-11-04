package mainClass;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Guru99Statics.*;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TestCaseOne {

	public void openingWeb(WebDriver driver) throws ATUTestRecorderException {
		/**
		 * DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss"); Date date
		 * = new Date(); //Created object of ATUTestRecorder //Provide path to store
		 * videos and file name format. recorder = new
		 * ATUTestRecorder("D:\\ScriptVideos\\","TestVideo-"+dateFormat.format(date),false);
		 * //To start video recording. recorder.start();
		 **/

		System.setProperty(Util.KEY, Util.VALUE);
		String baseUrl = Util.BASE_URL;
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);

	}

	public void sendKeys(WebDriver driver, String login, String password)
			throws InterruptedException, ATUTestRecorderException {

		ATUTestRecorder recorder;

		recorder = new ATUTestRecorder("/Users/dannymunoz/Develop/eclipse/development/RecordingTest",
				"Guru99TestExecution", false);
		recorder.start();

		Thread.sleep(3000);

		driver.findElement(By.xpath(Util.LOGIN_FIELD_XPATH)).sendKeys(login);
		driver.findElement(By.name(Util.PASSWORD_FIELD_NAME)).sendKeys(password);

		Thread.sleep(3000);

		driver.findElement(By.xpath(Util.LOGGIN_BUTTON_XPATH)).click();

		Thread.sleep(3000);

		recorder.stop();

	}

	/**
	 * 
	 * @param driver
	 * @param id     this method will check the name of the automatic greet on the
	 *               dashboard of the web site, it will compare with a valid login
	 *               stored in UTIL class
	 */
	public void manageId(WebDriver driver, String id) {

		// Get the id of any user.
		String isdisplayed = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"))
				.getText();
		String userId = "Manger Id :" + Util.LOGIN_ID;

		assertEquals(isdisplayed, userId);

	}

	public void wrongSendKeys(WebDriver driver) throws InterruptedException, ATUTestRecorderException {

		ATUTestRecorder recorder;

		recorder = new ATUTestRecorder("/Users/dannymunoz/Develop/eclipse/development/RecordingTest",
				"Guru99TestExecution", false);
		recorder.start();

		Thread.sleep(3000);

		driver.findElement(By.xpath(Util.LOGIN_FIELD_XPATH)).sendKeys(Util.LOGIN_ID + "E");
		driver.findElement(By.name(Util.PASSWORD_FIELD_NAME)).sendKeys(Util.PASSWORD + "E");

		Thread.sleep(3000);

		driver.findElement(By.xpath(Util.LOGGIN_BUTTON_XPATH)).click();

		Thread.sleep(3000);

		recorder.stop();

	}

	public void recordMethodStart(WebDriver driver) throws ATUTestRecorderException {
		ATUTestRecorder recorder;

		recorder = new ATUTestRecorder("/Users/dannymunoz/Develop/eclipse/development/RecordingTest",
				"Guru99TestExecution", false);
		recorder.start();

	}

	public String chekingTitle(WebDriver driver) {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

}
