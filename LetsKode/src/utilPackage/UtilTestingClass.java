package utilPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import expediaAutomation.ExpediaMethodsForTesting;
import javaClasses.StaticClass;

public class UtilTestingClass extends StaticClass {
	
	static WebDriver driver =new ChromeDriver();
	static String mesDep = "Mar";
	static String day = "3";
	static String mesRet = "Jun";
	static String dayRet = "3";
	static String choosen = "flight";

	 

	public static void main(String[] args) throws InterruptedException {
		ExpediaMethodsForTesting obj = new ExpediaMethodsForTesting();

		// This object will bring up the browser and will pick up departure and arrival
		// days from expedia web site
		//Opening
		WebDriver driver = new ChromeDriver();
		System.setProperty(StaticClass.KEY, StaticClass.PATH);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(StaticClass.BASE_URL);
		
		//Clicking flights button
		obj.optionSelection(driver, choosen);
		
		//Selecting Days from the calendar
		obj.mesesPosteriores(driver, mesDep, day, mesRet, dayRet);
		

	}

}
