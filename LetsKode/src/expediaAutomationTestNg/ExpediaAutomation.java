package expediaAutomationTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import expediaAutomation.ExpediaMethodsForTesting;
import javaClasses.StaticClass;

public class ExpediaAutomation extends StaticClass {
	WebDriver driver;
	String mesDep = "Mar";
	String day = "2";
	String mesRet = "Jun";
	String dayRet = "2";
	String choosen = "flight";
	String yearDep = "2021";
	String yearRet = "2021";
	String fromCity = "Santiago";
	String fromCountry = "Chile";
	String toCity = "Montreal";
	String toCountry = "Canada";

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		System.setProperty(StaticClass.KEY, StaticClass.PATH);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(StaticClass.BASE_URL);

	}

	@DataProvider
	public Object data() {

		Object[][] obj = new Object[1][11];

		// Valid login and password
		obj[0][0] = mesDep;
		obj[0][1] = day;
		obj[0][2] = mesRet;
		obj[0][3] = dayRet;
		obj[0][4] = choosen;
		obj[0][5] = yearDep;
		obj[0][6] = yearRet;
		obj[0][7] = fromCity;
		obj[0][8] = fromCountry;
		obj[0][9] = toCity;
		obj[0][10] = toCountry;

		System.out.println(obj[0][10]);

		return obj;
	}

	/**
	 * 
	 * @param a - mesDep
	 * @param b - day
	 * @param c - mesRet
	 * @param d - dayRet
	 * @param e - choosen
	 * @param f - yearDep
	 * @param g - yearRet
	 * @param h - fromCity
	 * @param i - fromCountry
	 * @param j - toCity
	 * @param k - toCountry
	 * @throws InterruptedException This method will receive all the data
	 *                              from @DataProvider a to k respective.
	 */
	@Test(dataProvider = "data")
	public void test(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j,
			String k) throws InterruptedException {

		ExpediaMethodsForTesting obj = new ExpediaMethodsForTesting();
		obj.opening();

		// Clicking flights button
		obj.optionSelection(driver, e);

		// Selecting Days from the calendar
		obj.mesesPosteriores(driver, a, b, c, d, f, g);

		Thread.sleep(2000);

		// Selecting destination
		obj.selectFrom(driver, h, i);
		Thread.sleep(2000);
		obj.selectTo(driver, j, k);
		// driver.close();
		driver.close();

	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 * @param g
	 * @param h
	 * @param i
	 * @param j
	 * @param k
	 * @throws InterruptedException This method might receive all the parameter from
	 *                              XML file, it does the same as the test above.
	 */
	@Parameters({ "Test_1", "Test_2", "Test_3", "Test_4", "Test_5", "Test_6", "Test_7", "Test_8", "Test_9", "Test_10",
			"Test_11" })
	@Test
	public void testDataFromXml(String a, String b, String c, String d, String e, String f, String g, String h,
			String i, String j, String k) throws InterruptedException {

		System.out.println(a + b + c + d + e + f + g + h);

		/**
		 * ExpediaMethodsForTesting obj = new ExpediaMethodsForTesting(); obj.opening();
		 * 
		 * // Clicking flights button obj.optionSelection(driver, e);
		 * 
		 * // Selecting Days from the calendar obj.mesesPosteriores(driver, a, b, c, d,
		 * f, g);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * // Selecting destination obj.selectFrom(driver, h, i); Thread.sleep(2000);
		 * obj.selectTo(driver, j, k); // driver.close(); driver.close();
		 **/

	}
}
