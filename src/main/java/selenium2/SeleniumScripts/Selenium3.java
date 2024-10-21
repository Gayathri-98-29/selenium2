package selenium2.SeleniumScripts;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		faceBook();	
		}

		// TODO Auto-generated method stub
		
	
public static void faceBook()
{
	
	   
	        // Set up ChromeDriver using WebDriverManager
	        WebDriverManager.chromedriver().setup();

	        // Initialize WebDriver (Chrome)
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to Facebook Create Account page
	            driver.get("https://www.facebook.com/");

	            // Maximize browser window
	            driver.manage().window().maximize();

	            // Click on "Create New Account" button
	            WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
	            createAccountButton.click();

	            // Pause for a few seconds to allow the new form to load
	            Thread.sleep(3000);

	            // Fill in the sign-up form
	            WebElement firstName = driver.findElement(By.name("firstname"));
	            firstName.sendKeys("Test");

	            WebElement lastName = driver.findElement(By.name("lastname"));
	            lastName.sendKeys("User");

	            WebElement mobileOrEmail = driver.findElement(By.name("reg_email__"));
	            mobileOrEmail.sendKeys("testuser@gmail.com");

	            WebElement password = driver.findElement(By.name("reg_passwd__"));
	            password.sendKeys("YourSecurePassword123!");

	            // Select a birthday from dropdowns
	            WebElement day = driver.findElement(By.name("birthday_day"));
	            WebElement dayDropdown = driver.findElement(By.name("birthday_day"));
	            Select daySelect = new Select(dayDropdown);
	            daySelect.selectByVisibleText("15");  // Selects 15th day
	            
	            // Locate the Month dropdown and select a month
	            WebElement monthDropdown = driver.findElement(By.name("birthday_month"));
	            Select monthSelect = new Select(monthDropdown);
	            monthSelect.selectByVisibleText("May");  // Selects May
	            
	            // Locate the Year dropdown and select a year
	            WebElement yearDropdown = driver.findElement(By.name("birthday_year"));
	            Select yearSelect = new Select(yearDropdown);
	            yearSelect.selectByVisibleText("1990");  // Selects the year 1990
	            // Select gender
	            WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
	            gender.click();

	            // Submit the form
	            WebElement signUpButton = driver.findElement(By.name("websubmit"));
	            signUpButton.click();

	            // Wait to see the result
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            //driver.quit();
	        }
	        
	    }
	}


