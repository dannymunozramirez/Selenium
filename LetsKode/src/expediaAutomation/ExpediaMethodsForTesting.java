package expediaAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javaClasses.StaticClass;

public class ExpediaMethodsForTesting extends StaticClass {

	@Override
	public void opening() {
		WebDriver driver = new ChromeDriver();
		System.setProperty(StaticClass.KEY, StaticClass.PATH);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(StaticClass.BASE_URL);

	}

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

	public void optionSelection(WebDriver driver, String choosen) {
		List<WebElement> choose = driver.findElements(By.cssSelector("a.uitk-tab-anchor"));
		for (WebElement we : choose) {
			if (we.getAttribute("aria-controls").contains(choosen)) {
				System.out.println("Tu seleccion es: " + choosen);
				we.click();
			}
		}

	}

	public void selectFrom() {

	}

	public void selectTo() {

	}

	//

	public void mesesActuales(WebDriver driver, String mesDep, String day, String mesRet, String dayRet) {

		List<WebElement> li = getElements(driver, "button[class*='uitk-new-date-picker-day']", "css");

		for (WebElement we : li) {

			if (we.getAttribute("aria-label").contains(mesDep) && we.getAttribute("aria-label").contains(day)) {
				System.out.println("Aca lo encontro primer loop!!!");
				System.out.println(we.getAttribute("aria-label"));
				we.click();

			}
			if (we.getAttribute("aria-label").contains(mesRet) && we.getAttribute("aria-label").contains(dayRet)) {
				System.out.println("Aca lo encontro primer loop!!!");
				System.out.println(we.getAttribute("aria-label"));
				we.click();
				driver.findElement(By.cssSelector("button[data-stid='apply-date-picker']")).click();
				break;
			}
		}
	}

	public void mesesPosteriores(WebDriver driver, String mesDep, String day, String mesRet, String dayRet)
			throws InterruptedException {
		
		driver.findElement(By.cssSelector("button#d1-btn")).click();

		List<WebElement> li4 = driver.findElements(By.cssSelector("button[class*='uitk-new-date-picker-day']"));
		WebElement next = driver.findElement(By.xpath("//div[@class='uitk-calendar']//button[@type='button'][2]"));

		boolean flag = false;

		for (WebElement we : li4) {

			System.out.println("################################");
			System.out.println(we.getAttribute("aria-label"));
			System.out.println("################################");
			if (we.getAttribute("aria-label").contains(mesDep) && we.getAttribute("aria-label").contains(day)) {
				System.out.println("Aca lo encontro primer loop!!!");
				System.out.println(we.getAttribute("aria-label"));
				we.click();

			}
			if (we.getAttribute("aria-label").contains(mesRet) && we.getAttribute("aria-label").contains(dayRet)) {
				System.out.println("Aca lo encontro primer loop!!!");
				System.out.println(we.getAttribute("aria-label"));
				we.click();
				flag = true;
				break;
			} else {

				Thread.sleep(2000);
				try {
					do {
						next.click();
						Thread.sleep(2000);
						li4 = driver.findElements(By.cssSelector("button[class*='uitk-new-date-picker-day']"));
						System.out.println("Cambiando los valores de la lista");
						for (WebElement we2 : li4) {
							if (we2.getAttribute("aria-label").contains(mesDep)
									&& we2.getAttribute("aria-label").contains(day)) {
								System.out.println("Aca lo encontro!!!");
								System.out.println(we2.getAttribute("aria-label"));
								we2.click();

							}
							if (we2.getAttribute("aria-label").contains(mesRet)
									&& we2.getAttribute("aria-label").contains(dayRet)) {
								System.out.println("Aca lo encontro!!!");
								System.out.println(we2.getAttribute("aria-label"));
								we2.click();
								driver.findElement(By.cssSelector("button[data-stid='apply-date-picker']")).click();
								flag = true;
								break;
							}

						}
					} while (!flag);
					break;
				} catch (Exception e) {
					System.out.println("Element found in the list");

				}
			}

		}
	}

}
