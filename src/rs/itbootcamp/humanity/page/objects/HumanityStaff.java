package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	
	public static final String URL="https://zelenizub.humanity.com/app/staff/list/load/true/";
	
	private static final String ADD_EMPLOY_XP="//button[@id='act_primary']";
	//private static final String FIRSTNAME_FRONT_XP="//input[@id='_asf";
	//private static final String LASTNAME_FRONT_XP="//input[@id='_asl";
	//private static final String EMAIL_FRONT_XP="//input[@id='_ase";
	//private static final String END_XP="']";
	private static final String SAVE_EMPLOY_XP="//button[@id='_as_save_multiple']";
	private static final String AVATAR_XP="//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	//private static final String SIGNOUT_XP="//div[@id='wrap_us_menu']";
	//private static final String SIGNOUT_XP="_navBottom _primNavQtip j-primary-navigation-qtip navBottom__userItem";
	private static final String SIGNOUT_XP="//a[contains(text(),'Sign Out')]";
	private static final String FIRSTNAME_FINAL_XP="//input[@id='_asf1']";
	private static final String LASTNAME_FINAL_XP="//input[@id='_asl1']";
	private static final String EMAIL_FINAL_XP="//input[@id='_ase1']";
	
	
	//add employee
	public static WebElement getAddEmploy(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOY_XP));
	}
	public static void clickAddEmploy(WebDriver driver) {
		getAddEmploy(driver).click();
	}
	// first name
		public static WebElement getFirstName(WebDriver driver) {
			return driver.findElement(By.xpath(FIRSTNAME_FINAL_XP));
		}
		public static void clickFirstName(WebDriver driver) {
			getFirstName(driver).click();
		}
		public static void inputFirstName(WebDriver driver, String data) {
			getFirstName(driver).sendKeys(data);
		}
		
		// last name
		public static WebElement getLastName(WebDriver driver) {
			return driver.findElement(By.xpath(LASTNAME_FINAL_XP));
		}
		public static void clickLastName(WebDriver driver, int red) {
			getLastName(driver).click();
		}
		public static void inputLastName(WebDriver driver, String data) {
			getLastName(driver).sendKeys(data);
		}
		//email
		public static WebElement getEmail(WebDriver driver) {
			return driver.findElement(By.xpath(EMAIL_FINAL_XP));
		}
		public static void clickEmail(WebDriver driver) {
			getEmail(driver).click();
		}
		public static void inputEmail(WebDriver driver, String data) {
			getEmail(driver).sendKeys(data);
		}
	
	
	/*
	// first name
	public static WebElement getFirstName(WebDriver driver, int red) {
		return driver.findElement(By.xpath(FIRSTNAME_FRONT_XP + red + END_XP));
	}
	public static void clickFirstName(WebDriver driver, int red) {
		getFirstName(driver, red).click();
	}
	public static void inputFirstName(WebDriver driver, int red, String data) {
		getFirstName(driver, red).sendKeys(data);
	}
	
	// last name
	public static WebElement getLastName(WebDriver driver, int red) {
		return driver.findElement(By.xpath(LASTNAME_FRONT_XP + red + END_XP));
	}
	public static void clickLastName(WebDriver driver, int red) {
		getLastName(driver, red).click();
	}
	public static void inputLastName(WebDriver driver, int red, String data) {
		getLastName(driver, red).sendKeys(data);
	}
	//email
	public static WebElement getEmail(WebDriver driver, int red) {
		return driver.findElement(By.xpath(EMAIL_FRONT_XP + red + END_XP));
	}
	public static void clickEmail(WebDriver driver, int red) {
		getEmail(driver, red).click();
	}
	public static void inputEmail(WebDriver driver, int red, String data) {
		getEmail(driver, red).sendKeys(data);
	}
	*/
	//save employ
		public static WebElement getSaveEmploy(WebDriver driver) {
			return driver.findElement(By.xpath(SAVE_EMPLOY_XP));
		}
		public static void clickSaveEmploy(WebDriver driver) {
			getSaveEmploy(driver).click();
		}
		//avatar for sign out
		public static WebElement getAvatar(WebDriver driver) {
			return driver.findElement(By.xpath(AVATAR_XP));
		}
		public static void clickAvatar(WebDriver driver) {
			getAvatar(driver).click();
		}
		//click signout
		
				public static WebElement getSignOut(WebDriver driver) {
					return driver.findElement(By.xpath(SIGNOUT_XP));
				}
				public static void clickSignOut(WebDriver driver) {
					getAvatar(driver).click();
				}
	
		
}
