package testNg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import mainClass.TestCaseOne;

public class TestGuru99 {
	WebDriver driver;

	@Test
	public void testOne() {

		TestCaseOne obj = new TestCaseOne();
		obj.chekingTitle(driver);

	}
}
