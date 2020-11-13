package javaClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticClass implements TestSteps {
	
	//WebElements to use//
	
	private String depDay;
	private String arrtDay;
	private String button;
	
	

	// ======================================================//

	public final static String CSS = "css";
	public final static String XPATH = "xpath";
	public final static String NAME = "name";
	public final static String ID = "id";
	public final static String LINK_TEXT = "linkText";

	// ===================================================//
	// URL
	public final static String KEY = "webdriver.chromedriver.driver";
	public final static String PATH = "/Users/dannymunoz/Develop/eclipse/development/SeleniumWD/chromedriver";
	public final static String BASE_URL = "https://www.expedia.com/";

	// ===================================================//
	// DOM Elements First Test Case

	public final static String REWARDS_BUTTON_CSS = "a[class='m-nav-main__link'][href='/rewards']";
	public final static String SIGN_IN_BUTTON_CSS = "a[class='a-btn'][href*='sign-up']";
	public final static String OPTION_CSS = "label[class='option'][for='edit-own-a-card']";

	// ===================================================//
	// Form
	public final static String FIRST_NAME_CSS = "input#edit-first-name";
	public final static String LAST_NAME_CSS = "input#edit-last-name";
	public final static String EMAIL_NAME = "email_address";
	public final static String EMAIL_CONFIRM_ID = "edit-confirm-email-address";
	public final static String PASSWORD_ID = "edit-password";
	public final static String CONFIRM_PASSWORD_ID = "edit-confirm-password";
	public final static String CHECK_BOX_PROMO_CSS = "label.option[for='edit-opt-in-promotions']";
	public final static String CHECK_BOX_POLICY_XPATH = "//*[@id=\"edit-agree-tos\"]";
	public final static String CHECK_BOX_AGE_CSS = "label.option[for='edit-majority']";
	public final static String SUBMIT_BTN_CSS = "input[name='op']";

	@Override
	public void opening() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getElemen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getElements() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actions() {
		// TODO Auto-generated method stub

	}

	public String getDepDay() {
		return depDay;
	}

	public void setDepDay(String depDay) {
		this.depDay = depDay;
	}

	public String getArrtDay() {
		return arrtDay;
	}

	public void setArrtDay(String arrtDay) {
		this.arrtDay = arrtDay;
	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}
	
	

}
