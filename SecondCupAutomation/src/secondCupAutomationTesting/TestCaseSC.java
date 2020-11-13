package secondCupAutomationTesting;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import methodsForAutomationSC.UseMethods;
import staticsForAutomationSC.StaticsSC;

/**
 * 
 * @author dannymunoz This class contains all the method for run a successful
 *         first scenario in the Second Cup Coffee Project MCIT
 *
 */
public class TestCaseSC {
	static StaticsSC st = new StaticsSC();
	WebDriver driver;

	public TestCaseSC(WebDriver driver) {
		this.driver = driver;

	}

	/**
	 * 
	 * @param form
	 * @throws InterruptedException This method will open the browser then it gets
	 *                              the data to fill out the form to test through
	 *                              the Map it set the data into the StaticSC class
	 *                              then it gets and send the keys values using the
	 *                              methods in UseMethod class.
	 */
	public void firstScenarioCreateNewUser(Map<String, String> form) throws InterruptedException {
		// Instance to Generic-methods
		UseMethods sc = new UseMethods();
		Actions act = new Actions(driver);
		int timeWait = 2000;

		//Opening Browser
		sc.opening(driver);

		//Looping and setting data into StaticSC class
		for (Map.Entry<String, String> entry : form.entrySet()) {
			String key = entry.getKey().toLowerCase();

			if (key.equals("firstname")) {
				st.setName(entry.getValue());
			} else if (entry.getValue().isBlank() || entry.getValue().isEmpty() || entry.getValue() == null) {
				st.setName("First Name not entered");

			}

			if (key.equals("lastname")) {
				if (entry.getValue().isBlank() || entry.getValue().isEmpty() || entry.getValue() == null) {
					st.setLast("Not values entered");
				} else {
					st.setLast(entry.getValue());
				}

			}
			if (key.equals("email")) {
				if (entry.getValue().isBlank() || entry.getValue().isEmpty() || entry.getValue() == null) {
					st.setEmail("Not values entered");
				} else {
					st.setEmail(entry.getValue());
				}

			}
			if (key.equals("password")) {
				if (entry.getValue().isBlank() || entry.getValue().isEmpty() || entry.getValue() == null) {
					st.setPassWord("Not values entered");
				} else {
					st.setPassWord(entry.getValue());
				}

			}
			if (key.equals("confirmpass")) {
				if (entry.getValue().isBlank() || entry.getValue().isEmpty() || entry.getValue() == null) {
					st.setPasswordConf("Not values entered");
				} else {
					st.setPasswordConf(entry.getValue());
				}

			}
			if (key.equals("confirmemail")) {
				if (entry.getValue().isBlank() || entry.getValue().isEmpty() || entry.getValue() == null) {
					st.setEmailConf("Not values entered");
				} else {
					st.setEmailConf(entry.getValue());
				}

			}

		}

		/**
		 * Clicking and sending keys obtained  from StaticSC
		 */
		try {
			Thread.sleep(timeWait);
			sc.getElement(driver, StaticsSC.REWARDS_BUTTON_CSS, StaticsSC.CSS).click();
			Thread.sleep(timeWait);
			sc.getElement(driver, StaticsSC.SIGN_IN_BUTTON_CSS, StaticsSC.CSS).click();
			Thread.sleep(timeWait);
			sc.getElement(driver, StaticsSC.OPTION_CSS, StaticsSC.CSS).click();
			;
			Thread.sleep(timeWait);
			sc.getElement(driver, StaticsSC.FIRST_NAME_CSS, StaticsSC.CSS).sendKeys(st.getName());
			Thread.sleep(timeWait);
			sc.getElement(driver, StaticsSC.LAST_NAME_CSS, StaticsSC.CSS).sendKeys(st.getLast());
			Thread.sleep(timeWait);
			sc.getElement(driver, StaticsSC.EMAIL_NAME, StaticsSC.NAME).sendKeys(st.getEmail());
			Thread.sleep(timeWait);
			sc.getElement(driver, StaticsSC.EMAIL_CONFIRM_ID, StaticsSC.ID).sendKeys(st.getEmail());
			Thread.sleep(timeWait);

			sc.getElement(driver, StaticsSC.PASSWORD_ID, StaticsSC.ID).sendKeys(st.getPassword());
			Thread.sleep(timeWait);
			sc.getElement(driver, StaticsSC.CONFIRM_PASSWORD_ID, StaticsSC.ID).sendKeys(st.getPasswordConf());

		} catch (Exception e) {
			System.out.println("Values not entered");
		}
		Thread.sleep(timeWait);
		sc.getElement(driver, StaticsSC.CHECK_BOX_PROMO_CSS, StaticsSC.CSS).click();

		Thread.sleep(timeWait);

		WebElement box = sc.getElement(driver, StaticsSC.CHECK_BOX_POLICY_XPATH, StaticsSC.XPATH);
		act.moveToElement(box).click().release().build().perform();

		Thread.sleep(timeWait);
		sc.getElement(driver, StaticsSC.CHECK_BOX_AGE_CSS, StaticsSC.CSS).click();
		Thread.sleep(timeWait);
		String button = sc.getElement(driver, StaticsSC.SUBMIT_BTN_CSS, StaticsSC.CSS).getTagName();
		System.out.println(button);

	}

}
