package rs.itbootcamp.humanity.page.tests;


import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class testLogin{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	   //website navigation
		driver.get(HumanityHome.HOME_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
			
		HumanityHome.clickLogin(driver);
		HumanityHome.inputLoginEmail(driver, "cobosivol@coin-host.net");
		HumanityHome.inputLoginPass(driver, "12upload34");
		HumanityHome.clickLoginButton(driver);
		
		HumanityMenu.clickLeave(driver);
		HumanityMenu.clickTraining(driver);
		HumanityStaff.clickAvatar(driver);
		
		HumanityStaff.clickSignOut(driver);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityHome.inputLoginEmail(driver, "cobosivol@coin-host.net");
		HumanityHome.inputLoginPass(driver, "12upload34");
		HumanityHome.clickLoginButton(driver);	
			
		

		Thread.sleep(3000);
		driver.quit();
	



	}

}
