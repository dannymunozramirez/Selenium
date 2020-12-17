package javaClasses;

public class StaticClass implements TestSteps {

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
	public final static String MENU_BAR = "a.uitk-tab-anchor";
	public final static String FROM_CITY_PATH_ONE = "//strong[contains(text(), '";
	public final static String FROM_CITY_PATH_TWO = "')]//parent::span//parent::div//parent::div//parent::button";
	public final static String FROM_COUNTRY_PATH = "div[class=\"is-subText truncate\"]";
	public final static String FLIGHT_BUTTON = "a[href='?pwaLob=wizard-flight-pwa']";
	public final static String FROM_IMPUT = "button[aria-label='Leaving from']";
	public final static String CITY_FROM_FILL_OUT = "input[data-stid=\"location-field-leg1-origin-menu-input\"]";
	public final static String TO_CITY_PATH_ONE = "//strong[contains(text(), '";
	public final static String TO_CITY_PATH_TWO = "')]//parent::span//parent::div//parent::div//parent::button";
	public final static String TO_COUNTRY_PATH = "//button//div//following-sibling::div";
	public final static String SELECT_CITY_TO_BUTTON = "button[aria-label=\"Going to\"]";
	public final static String INPUT_CITY_TO = "input[data-stid=\"location-field-leg1-destination-menu-input\"]";
	public final static String DAYS_OF_THE_CALENDAR = "button[class*='uitk-new-date-picker-day']";
	public final static String NEXT_MONTH_CALENDAR_BUTTON = "//div[@class='uitk-calendar']//button[@type='button'][2]";
	public final static String FINAL_BUTTON_PICKER_CALENDAR = "button[data-stid='apply-date-picker']";
	
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

}
