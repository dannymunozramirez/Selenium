package staticsForAutomationSC;

public class StaticsSC {
	
	private String name;
	private String last;
	private String email;
	private String emailConf;
	private String password;
	private String passwordConf;
	
	
	
	
	
	//===================================================//
		//Types
	public final static String CSS = "css";
	public final static String XPATH = "xpath";
	public final static String NAME = "name";
	public final static String ID = "id";
	
	//===================================================//
		//URL
	public final static String KEY = "webdriver.chromedriver.driver";
	public final static String PATH = "/Users/dannymunoz/Develop/eclipse/development/SeleniumWD/chromedriver";
	public final static String BASE_URL = "https://secondcup.com/";

	
	//===================================================//
	//DOM Elements First Test Case
	
	public final static String REWARDS_BUTTON_CSS = "a[class='m-nav-main__link'][href='/rewards']";
	public final static String SIGN_IN_BUTTON_CSS = "a[class='a-btn'][href*='sign-up']";
	public final static String OPTION_CSS = "label[class='option'][for='edit-own-a-card']";
	
	//===================================================//
		//Form
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
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassWord(String passWord) {
		this.password = passWord;
	}
	public String getEmailConf() {
		return emailConf;
	}
	public void setEmailConf(String emailConf) {
		this.emailConf = emailConf;
	}
	public String getPasswordConf() {
		return passwordConf;
	}
	public void setPasswordConf(String passwordConf) {
		this.passwordConf = passwordConf;
	}
	
	
	//===================================================//
		//Fill out the register form
	
}
