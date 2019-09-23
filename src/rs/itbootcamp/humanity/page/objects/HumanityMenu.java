package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	
	public static final String URL="https://zelenizub.humanity.com/app/dashboard/";
	
	private static final String DASHBOARD_XP="//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static final String SHIFTPLAN_XP="//a[@id='sn_schedule']//span[@class='primNavQtip__inner']";
	private static final String TIMECLOCK_XP="//a[@id='sn_timeclock']//span[@class='primNavQtip__inner']";
	private static final String LEAVE_XP="//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String TRAINING_XP="//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static final String STAFF_XP="//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String PAYROLL_XP="//a[@id='sn_payroll']//span[@class='primNavQtip__inner']";
	private static final String REPORTS_XP="//a[@id='sn_reports']//span[@class='primNavQtip__inner']";
	
	//Dashboard
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_XP));
	}
	public static void clickDashboard(WebDriver driver) {
		getDashboard(driver).click();
	}
	//Shift Planning
	public static WebElement getShiftPlan(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFTPLAN_XP));
	}
	public static void clickShiftPlan(WebDriver driver) {
		getShiftPlan(driver).click();
	}
	//Time Clock
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIMECLOCK_XP));
	}
	public static void clickTimeClock(WebDriver driver) {
		getTimeClock(driver).click();
	}
	//Leave
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XP));
	}
	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}
	//Training
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_XP));
	}
	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}
	//Staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XP));
	}
	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}
	//Payroll
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_XP));
	}
	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}
	//Reports
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_XP));
	}
	public static void clickReports(WebDriver driver) {
		getReports(driver).click();
	}
	
	
}
