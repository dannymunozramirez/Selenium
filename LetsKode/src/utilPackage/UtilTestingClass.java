package utilPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import expediaAutomation.ExpediaMethodsForTesting;
import javaClasses.StaticClass;

/**
 * 
 * @author dannymunoz +1 514 9804595 - @ danny.munoz.ramirez@gmail.com
 * 
 *         This class will test the home page of expedia web site (Training
 *         purpose), it will select the flights option then it will choose a
 *         departure date (2° of march) which is not visible in the calendar,
 *         then it will select return date (2° of June 2021) which is not
 *         visible in the calendar, so the automation will use the next button
 *         in the calendar to find the chosen dates, then it will choose a given
 *         city from and given city to, which are (Santiago, Chile and Montreal,
 *         Canada), respective.
 */
public class UtilTestingClass extends StaticClass {
	
	static WebDriver driver;
	static String mesDep = "Dec";
	static String day = "17";
	static String mesRet = "Feb";
	static String dayRet = "28";
	static String choosen = "flight";
	static String yearDep = "2020";
	static String yearRet = "2021";
	static String fromCity = "Santiago";
	static String fromCountry = "Chile";
	static String toCity = "Montreal";
	static String toCountry = "Canada";

	public static void main(String[] args) throws InterruptedException {
		ExpediaMethodsForTesting obj = new ExpediaMethodsForTesting();
		driver = new ChromeDriver();
		System.setProperty(StaticClass.KEY, StaticClass.PATH);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(StaticClass.BASE_URL);

		obj.opening();

		// Clicking flights button
		obj.optionSelection(driver, choosen);

		// Selecting Days from the calendar
		obj.mesesPosteriores(driver, mesDep, day, mesRet, dayRet, yearDep, yearRet);
		//obj.mesesActuales(driver, mesDep, day, mesRet, dayRet, yearDep, yearRet);

		Thread.sleep(2000);

		// Selecting destination
		obj.selectFrom(driver, fromCity, fromCountry);
		Thread.sleep(2000);
		obj.selectTo(driver, toCity, toCity);
		// driver.close();
		driver.close();

	}

}
