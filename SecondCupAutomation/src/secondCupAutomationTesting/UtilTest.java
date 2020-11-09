package secondCupAutomationTesting;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import staticsForAutomationSC.StaticsSC;

/**
 * 
 * @author dannymunoz @email danny.alexis1984@gmail.com
 * 
 *         This Automation Testing Class will automate test scenarios for Second
 *         Cup Coffee CO. Project I MCIT
 */
public class UtilTest {
	static StaticsSC st = new StaticsSC();
	static WebDriver driver = new ChromeDriver();

	static String firstName = "Test";
	static String lastName = "Test";
	static String email = "Test";
	static String password = "Test";
	static String confirmEmail = "Test";
	static String confirmPass = "Test";
	

	public static void main(String[] args) throws InterruptedException {

		// =======================================================//
		// First scenario creating a new user with Not valid Values
		TestCaseSC firstScenario = new TestCaseSC(driver);

		Map<String, String> form = new HashMap<String, String>();
		form.put("FirstName", firstName);
		form.put("lastName", lastName);
		form.put("email", email);
		form.put("password", password);
		form.put("confirmEmail", confirmEmail);
		form.put("confirmPass", confirmPass);
		

		firstScenario.firstScenarioCreateNewUser(form);

		// =======================================================//

		/**
		// First scenario creating a new user with valid Values
		TestCaseSC SecondScenario = new TestCaseSC(driver);

		Map<String, String> form = new HashMap<String, String>();
		form.put("FirstName", firstName);
		form.put("lastName", lastName);
		form.put("email", email);
		form.put("password", password);

		firstScenario.firstScenarioCreateNewUser(form);
		**/
	}

}
