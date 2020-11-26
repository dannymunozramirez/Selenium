package javaClasses;

public class StaticClass implements TestSteps {
	
	//WebElements to use//
	
	private String mesDep = "Mar";
	private String day = "2";
	private String mesRet = "Jun";
	private String dayRet = "2";
	private String choosen = "flight";
	private String yearDep = "2021";
	private String yearRet = "2021";
	private String fromCity = "Santiago";
	private String fromCountry = "Chile";
	private String toCity = "Montreal";
	private String toCountry = "Canada";
	
	

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

	public String getMesDep() {
		return mesDep;
	}

	public void setMesDep(String mesDep) {
		this.mesDep = mesDep;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMesRet() {
		return mesRet;
	}

	public void setMesRet(String mesRet) {
		this.mesRet = mesRet;
	}

	public String getDayRet() {
		return dayRet;
	}

	public void setDayRet(String dayRet) {
		this.dayRet = dayRet;
	}

	public String getChoosen() {
		return choosen;
	}

	public void setChoosen(String choosen) {
		this.choosen = choosen;
	}

	public String getYearDep() {
		return yearDep;
	}

	public void setYearDep(String yearDep) {
		this.yearDep = yearDep;
	}

	public String getYearRet() {
		return yearRet;
	}

	public void setYearRet(String yearRet) {
		this.yearRet = yearRet;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getFromCountry() {
		return fromCountry;
	}

	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getToCountry() {
		return toCountry;
	}

	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}
	
	//VARIABLES GETTERS
	// ===================================================//
	
	
	
	

}
