package methodsForAutomationSC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import staticsForAutomationSC.StaticsSC;

public class UseMethods {

	/**
	 * This method will open the web site to test, it will get the info about it
	 * from StaticsSC class
	 */
	public void opening(WebDriver driver) {

		System.setProperty(StaticsSC.KEY, StaticsSC.PATH);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(StaticsSC.BASE_URL);

	}

	/**
	 * 
	 * @param locator
	 * @param type
	 * @return This method will get one element depending of which type the user
	 *         want to find.
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
	 * @param locator
	 * @param type
	 * @return This method will get the elements depending of which type the user
	 *         want to find.
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
	 * @param locator
	 * @param type
	 * @return This Method will found elements if are present or not
	 */

	public boolean isElementPresent(WebDriver driver, String locator, String type) {
		List<WebElement> elemnts = getElements(driver, locator, type);

		int size = elemnts.size();

		if (size > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param locator
	 * @param timeOut
	 * @return This method will wait until the element entered is found, then it
	 *         will return the webElement.
	 */

	public WebElement timeToWaitExplicit(WebDriver driver, By locator, int timeOut) {

		WebElement element = null;

		try {
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("Element not appeared on the web page");
		}

		return element;

	}

	public WebElement clickWhenIsReady(WebDriver driver, By locator, int timeOut) {

		WebElement element = null;

		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			System.out.println("Element clicked on the web page");
			element.click();
		} catch (Exception e) {
			System.out.println("Element not clicked on the web page");
		}

		return element;

	}

}
