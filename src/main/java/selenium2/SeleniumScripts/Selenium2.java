package selenium2.SeleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Selenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();
		        
		        try {
		            // Open Snapdeal
		            driver.get("https://www.snapdeal.com");
		            driver.manage().window().maximize();
		            WebElement cursor=	driver.findElement(By.xpath("//span[text()='Sign In']"));
		    		Actions action =new Actions(driver);
		    action.clickAndHold(cursor).perform();
		            // Click on "Sign In" button
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Sign In')]")));
		            signInButton.click();
		            
		            // Click on "Login" from the dropdown
		            WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'login')]")));
		            loginButton.click();
		            
		            // Switch to iframe where login form is loaded
		            WebElement loginIframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@id,'loginIframe')]")));
		            driver.switchTo().frame(loginIframe);
		            
		            // Enter mobile number or email
		            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
		            usernameField.sendKeys("gayathrihbk@gmail.com");  // Replace with actual email or mobile
		            
		            // Click on "Continue" button
		            WebElement continueButton = driver.findElement(By.id("checkUser"));
		            continueButton.click();
		            
		            // Here, Snapdeal sends an OTP to mobile or email. You will have to handle the OTP entry manually.
		            // If required, you can prompt for OTP and continue the script.
		            
		            // Wait for OTP to be entered manually and login to complete
		            System.out.println("Please enter OTP and complete login manually within 60 seconds.");
		            Thread.sleep(60000);  // Adjust this time as needed for OTP entry
		           
		            driver.switchTo().defaultContent();
		            
		            // Verification: Check for user account menu or a welcome message
		            WebElement userMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Your Account')]")));
		            
		            // Verify if the user account or success message is displayed
		            if (userMenu.isDisplayed()) {
		                System.out.println("Login successful! User menu is displayed.");
		            } else {
		                System.out.println("Login failed. User menu not found.");
		            }
		            
		            // Alternatively, you can check for any login-specific messages
		            // For example: Welcome message
		            WebElement welcomeMessage = driver.findElement(By.xpath("//span[contains(text(),'Welcome')]"));
		            if (welcomeMessage.isDisplayed()) {
		                System.out.println("Login verification passed with welcome message!");
		            } else {
		                System.out.println("Login verification failed, no welcome message found.");
		            }

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the browser after the process
		            driver.quit();
		        }
		    }
		
		        
		    }
		


	


