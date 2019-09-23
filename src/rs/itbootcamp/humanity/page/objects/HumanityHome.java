package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	
	public static final String HOME_URL="https://www.humanity.com";
	public static final String LOGIN_URL="public static final String";
			
	private static final String ABOUTUS_XP="//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String LOGIN_XP="//p[contains(text(),'LOGIN')]";
	private static final String NAME_XP="//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String EMAIL_XP="//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String STARTFREELOWER_XP="//input[@id='free-trial-link-01']";
	private static final String STARTFREEHIGHER_XP="//a[@class='button pale']";
	//private static final String NAMEPOPUP_XP="//div[@class='form-group']//input[@placeholder='Full Name']";
	//private static final String EMAILPOPUP_XP="//div[@class='form-group']//input[@placeholder='Work Email']";
	//private static final String STARTFREEPOPUP_XP="//input[@id='popup-free-trial-link']";
	private static final String LOGINEMAIL_XP="//input[@id='email']";
	private static final String LOGINPASS_XP="//input[@id='password']";
	private static final String LOGINBUTTON_XP="//button[contains(text(),'Log in')]";
	
	
	
	//about us
	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUTUS_XP));
	}
	
	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}
	
	//lower free trial: name, mail, click button
	public static WebElement getName(WebDriver driver) {
		return driver.findElement(By.xpath(NAME_XP));
	}
	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}
	public static void inputName(WebDriver driver, String data) {
		getName(driver).sendKeys(data);
	}
	
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XP));
	}
	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}
	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}
	
	public static WebElement getStartFreeLower(WebDriver driver) {
		return driver.findElement(By.xpath(STARTFREELOWER_XP));
	}
	public static void clickStartFreeLower(WebDriver driver) {
		getStartFreeLower(driver).click();
	}

	public static WebElement getStartFreeHigher(WebDriver driver) {
		return driver.findElement(By.xpath(STARTFREEHIGHER_XP));
	}
	public static void clickStartFreeHigher(WebDriver driver) {
		getStartFreeHigher(driver).click();
	}
	
	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XP));
	}
	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}
	
	public static WebElement getLoginEmail(WebDriver driver) {
		return driver.findElement(By.xpath(LOGINEMAIL_XP));
	}
	public static void clickLoginEmail(WebDriver driver) {
		getLoginEmail(driver).click();
	}
	public static void inputLoginEmail(WebDriver driver, String data) {
		getLoginEmail(driver).sendKeys(data);
	}
	
	public static WebElement getLoginPass(WebDriver driver) {
		return driver.findElement(By.xpath(LOGINPASS_XP));
	}
	public static void clickLoginPass(WebDriver driver) {
		getLoginPass(driver).click();
	}
	public static void inputLoginPass(WebDriver driver, String data) {
		getLoginPass(driver).sendKeys(data);
	}
	
	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGINBUTTON_XP));
	}
	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}
	
	
	
}
