import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import expediaAutomation.ExpediaMethodsForTesting;
import javaClasses.StaticClass;

public class PreviusTest {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(StaticClass.KEY, StaticClass.PATH);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(StaticClass.BASE_URL);
		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='?pwaLob=wizard-flight-pwa']")).click();

		driver.findElement(By.cssSelector("button#d1-btn")).click();
		// WebElement nextMonthBtn =
		// driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]"));

		Thread.sleep(2000);
		String textOne = driver
				.findElement(By.xpath("//div[@class='uitk-new-date-picker-menu-months-container']//div[1]/h2"))
				.getText();
		String textTwo = driver
				.findElement(By.xpath("//div[@class='uitk-new-date-picker-menu-months-container']//div[2]/h2"))
				.getText();

		// String day =
		// driver.findElement(By.xpath("//td[@class='uitk-new-date-picker-day-number
		// startSelected']//button[@data-day='27']")).getText(); // month yyyy

		Thread.sleep(2000);

		System.out.println("First Calendar Month");
		System.out.println(textOne);

		System.out.println("Second Calendar Month");
		System.out.println(textTwo);

		// First calendar
		System.out.println("First calendar");
		List<WebElement> li = driver.findElements(By
				.xpath("//div[@class='uitk-new-date-picker-menu-months-container']//div[1]//table/tbody/tr/td/button"));

		for (WebElement we : li) {
			System.out.println(we.getAttribute("aria-label"));

		}

		System.out.println("======================================");

		// Second calendar
		System.out.println("Second calendar");
		List<WebElement> li3 = driver.findElements(By
				.xpath("//div[@class='uitk-new-date-picker-menu-months-container']//div[2]//table/tbody/tr/td/button"));
		List<String> li23 = new ArrayList<>();

		for (WebElement we : li) {
			System.out.println(we.getAttribute("aria-label"));

		}

		List<WebElement> icons = driver.findElements(By.cssSelector("a.uitk-tab-anchor span.uitk-tab-text"));

		for (WebElement we : icons) {
			System.out.println(we.getText());
		}

		// System.out.println(day);

		// //*[@id="wizard-hotel-pwa-v2-1"]/div[1]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]
		// //*[@id="wizard-hotel-pwa-v2-1"]/div[1]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]

		// //div[@class='uitk-new-date-picker-menu-months-container']//div[2]/div/div[1]/div[1]/button[2]
		
		//Clicking Flights
		
		
		String mesDep = "Nov";
		String day = "13";
		String mesRet = "Nov";
		String dayRet = "30";
		
		ExpediaMethodsForTesting meses = new ExpediaMethodsForTesting();

		try {
			meses.mesesActuales(driver, mesDep, day, mesRet, dayRet);
			//meses.mesesPosteriores(driver, mesDep, day, mesRet, dayRet);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("button[data-stid='apply-date-picker']")).click();
			
			driver.close();
		} catch (Exception e) {
			System.out.println("Dia seleccionado no disponible");
			driver.close();
		}
		
	}

}
