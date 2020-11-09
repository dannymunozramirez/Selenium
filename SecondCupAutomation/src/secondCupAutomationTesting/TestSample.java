package secondCupAutomationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import methodsForAutomationSC.UseMethods;
import staticsForAutomationSC.StaticsSC;

public class TestSample {
	static StaticsSC st = new StaticsSC();
	static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		UseMethods sc = new UseMethods();

		sc.opening(driver);
		
		Thread.sleep(2000);
		sc.getElement(driver, StaticsSC.REWARDS_BUTTON_CSS, StaticsSC.CSS).click();
		Thread.sleep(2000);
		sc.getElement(driver, StaticsSC.SIGN_IN_BUTTON_CSS, StaticsSC.CSS).click();
		Thread.sleep(2000);
		sc.getElement(driver, StaticsSC.OPTION_CSS, StaticsSC.CSS).click();
		
		Actions act = new Actions(driver);
		WebElement box = driver.findElement(By.xpath("//*[@id=\"edit-agree-tos\"]"));
		act.moveToElement(box).click().release().build().perform();
		
		

	}

}
