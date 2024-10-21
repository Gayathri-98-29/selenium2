package selenium2.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Setup WebDriver
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the page
		        driver.get("https://jqueryui.com/droppable/");
		        
		        // Switch to the iframe containing the drag and drop elements
		        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		        
		        // Locate the source (drag me) and target (drop here) elements
		        WebElement source = driver.findElement(By.id("draggable"));
		        WebElement target = driver.findElement(By.id("droppable"));

		        // Perform drag and drop
		        Actions actions = new Actions(driver);
		        actions.dragAndDrop(source, target).perform();

		        // Get the text of the target element after the drop
		        String targetText = target.getText();
		        System.out.println("Target text after drop: " + targetText);

		        // Get the background color of the target element after the drop
		        String backgroundColor = target.getCssValue("background-color");
		        System.out.println("Target background color after drop: " + backgroundColor);

		        // Close the browser
		        driver.quit();
		    }
		

	}
		
        
	


