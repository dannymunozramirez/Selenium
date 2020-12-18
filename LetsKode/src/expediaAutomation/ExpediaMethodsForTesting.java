package expediaAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import javaClasses.StaticClass;

public class ExpediaMethodsForTesting extends StaticClass {

	/**
	 * 
	 */
	public void opening(WebDriver driver) {
		System.setProperty(StaticClass.KEY, StaticClass.PATH);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(StaticClass.BASE_URL);

	}

	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param type
	 * @return
	 */
	public WebElement getElement(WebDriver driver, String locator, String type) {
		type = type.toLowerCase();

		if (type.equals("id")) {
			System.out.println("Element found by id ");
			return driver.findElement(By.id(locator));

		} else if (type.equals("name")) {
			System.out.println("Element found by name ");

			return driver.findElement(By.name(locator));

		} else if (type.equals("xpath")) {
			System.out.println("Element found by xpath " + locator);
			return driver.findElement(By.xpath(locator));
		} else if (type.equals("css")) {
			System.out.println("Element found by css ");
			return driver.findElement(By.cssSelector(locator));
		} else
			return null;
	}

	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param type
	 * @return
	 */
	public List<WebElement> getElements(WebDriver driver, String locator, String type) {
		type = type.toLowerCase();

		if (type.equals("id")) {
			System.out.println("Element found by id " + locator);
			return driver.findElements(By.id(locator));

		} else if (type.equals("name")) {
			System.out.println("Element found by name " + locator);

			return driver.findElements(By.name(locator));

		} else if (type.equals("xpath")) {
			System.out.println("Element found by xpath " + locator);
			return driver.findElements(By.xpath(locator));
		} else if (type.equals("css")) {
			System.out.println("Element found by css " + locator);
			return driver.findElements(By.cssSelector(locator));
		} else
			return null;
	}

	/**
	 * 
	 * @param driver
	 * @param choosen
	 */
	public void optionSelection(WebDriver driver, String choosen) {
		// Matching the chosen section in the menu bar, and clicking
		List<WebElement> choose = getElements(driver, StaticClass.MENU_BAR, "css");
		for (WebElement we : choose) {
			if (we.getAttribute("aria-controls").contains(choosen)) {
				we.click();
			}
		}

	}

	/**
	 * 
	 * @param driver
	 * @param where
	 * @param country
	 * @throws InterruptedException
	 */
	public void selectFrom(WebDriver driver, String from, String country) throws InterruptedException {
		getElement(driver, StaticClass.FLIGHT_BUTTON, "css").click();
		Thread.sleep(2000);
		getElement(driver, StaticClass.FROM_IMPUT, "css").click();
		Thread.sleep(2000);
		getElement(driver, StaticClass.CITY_FROM_FILL_OUT, "css").sendKeys(from);
		Thread.sleep(2000);

		List<WebElement> fromList = getElements(driver,
				StaticClass.FROM_CITY_PATH_ONE + from + StaticClass.FROM_CITY_PATH_TWO, "xpath");
		List<WebElement> countryLi = getElements(driver, StaticClass.FROM_COUNTRY_PATH, "css");

		for (WebElement we : fromList) {

			if (we.getText().contains(from)) {
				for (WebElement we2 : countryLi) {
					if (we2.getText().contains(country)) {
						we2.click();
					}

				}
			}

		}

	}

	/**
	 * 
	 * @param driver
	 * @param to
	 * @param country
	 * @throws InterruptedException
	 */
	public void selectTo(WebDriver driver, String to, String country) throws InterruptedException {
		Thread.sleep(2000);
		getElement(driver, StaticClass.SELECT_CITY_TO_BUTTON, "css").click();
		Thread.sleep(2000);
		getElement(driver, StaticClass.INPUT_CITY_TO, "css").sendKeys(to);
		Thread.sleep(2000);

		List<WebElement> toList = getElements(driver, StaticClass.TO_CITY_PATH_ONE + to + StaticClass.TO_CITY_PATH_TWO,
				"xpath");

		List<WebElement> countryTo = getElements(driver, StaticClass.TO_COUNTRY_PATH, "xpath");

		for (WebElement we : countryTo) {
			if (we.getText().contains(country)) {
				for (WebElement we2 : toList) {
					if (we2.getText().contains(to)) {
						Thread.sleep(2000);
						we2.click();
					}
				}
			}

		}

	}

	//

	/**
	 * 
	 * @param driver
	 * @param mesDep
	 * @param day
	 * @param mesRet
	 * @param dayRet
	 */
	public void mesesActuales(WebDriver driver, String mesDep, String day, String mesRet, String dayRet, String yearDep,
			String yearRet) {

		String dateDep = mesDep + " " + day + ", " + yearDep;
		String dateRet = mesRet + " " + dayRet + ", " + yearRet;

		List<WebElement> li = getElements(driver, "button[class*='uitk-new-date-picker-day']", "css");

		for (WebElement we : li) {

			if (we.getAttribute("aria-label").equals(dateDep)) {
				we.click();
			}
			if (we.getAttribute("aria-label").equals(dateRet)) {
				we.click();
				getElement(driver, "button[data-stid='apply-date-picker']", "css");
				break;
			}
		}
	}

	/**
	 * 
	 * @param driver
	 * @param mesDep
	 * @param day
	 * @param mesRet
	 * @param dayRet
	 * @param yearDep
	 * @param yearRet
	 * @throws InterruptedException
	 */
	public void mesesPosteriores(WebDriver driver, String mesDep, String day, String mesRet, String dayRet,
			String yearDep, String yearRet) throws InterruptedException {
		// Building String Date
		boolean flag = false;
		boolean flag_two = false;
		String dateDep = mesDep + " " + day + ", " + yearDep;
		String dateRet = mesRet + " " + dayRet + ", " + yearRet;

		getElement(driver, "button#d1-btn", "css").click();

		List<WebElement> li4 = getElements(driver, StaticClass.DAYS_OF_THE_CALENDAR, "css");
		WebElement next = getElement(driver, StaticClass.NEXT_MONTH_CALENDAR_BUTTON, "xpath");

//		

		// Departure date
		for (WebElement we : li4) {

			if (we.getAttribute("aria-label").equals(dateDep)) {
				System.out.println(we.getAttribute("aria-label"));
				flag = true; // Encontrado!
				we.click();

			}

		}

		if (!flag) {
			Thread.sleep(2000);
			try {
				do {
					next.click();
					Thread.sleep(2000);
					li4 = getElements(driver, StaticClass.DAYS_OF_THE_CALENDAR, "css");
					for (WebElement we2 : li4) {
						if (we2.getAttribute("aria-label").equals(dateDep)) {
							System.out.println(we2.getAttribute("aria-label"));
							we2.click();
							flag = true; // Encontrado!
						}
					}
				} while (!flag);

			} catch (Exception e) {
				System.out.println("Element not found in the list");

			}

		}

		// Returning date
		for (WebElement we : li4) {

			if (we.getAttribute("aria-label").equals(dateRet)) {
				System.out.println(we.getAttribute("aria-label"));
				flag_two = true; // Encontrado!
				we.click();

			}

		}

		if (!flag_two) {
			Thread.sleep(2000);
			try {
				do {
					next.click();
					Thread.sleep(2000);
					li4 = getElements(driver, StaticClass.DAYS_OF_THE_CALENDAR, "css");
					for (WebElement we2 : li4) {
						if (we2.getAttribute("aria-label").equals(dateRet)) {
							System.out.println(we2.getAttribute("aria-label"));
							we2.click();
							flag_two = true; // Encontrado!
						}
					}
				} while (!flag_two);

			} catch (Exception e) {
				System.out.println("Element not found in the list");

			}

		}

	}

}
