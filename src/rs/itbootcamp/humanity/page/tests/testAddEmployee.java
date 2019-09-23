package rs.itbootcamp.humanity.page.tests;


import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class testAddEmployee{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	   //website navigation
		driver.get(HumanityHome.HOME_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//login
		HumanityHome.clickLogin(driver);
		HumanityHome.inputLoginEmail(driver, "cobosivol@coin-host.net");
		HumanityHome.inputLoginPass(driver, "12upload34");
		HumanityHome.clickLoginButton(driver);
		//add employee
		HumanityMenu.clickStaff(driver);
		HumanityStaff.clickAddEmploy(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//employee data
		String ime ="Pera";
		String prezime= "Detlic";
		String email= "pdet@mail.com";
		HumanityStaff.inputFirstName(driver, ime);
		HumanityStaff.inputLastName(driver, prezime);
		HumanityStaff.inputEmail(driver, email);
		HumanityStaff.clickSaveEmploy(driver);
		
	
		
		/*
		//add picture
		WebElement pera=driver.findElement(By.xpath("//a[contains(text(),'Pera Detlic')]"));
		pera.click();
		WebElement editDetails=driver.findElement(By.xpath("//a[contains(text(),'Edit Details')]"));
		editDetails.click();
		WebElement upload=driver.findElement(By.xpath("//input[@id='fileupload']"));
		upload.click();
		*/
		
		Thread.sleep(3000);
		driver.quit();
	

	}

}
