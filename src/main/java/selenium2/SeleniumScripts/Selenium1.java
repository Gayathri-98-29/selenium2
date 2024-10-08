package selenium2.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Selenium1
{
    public static void main( String[] args )
    {
      firefox();
       
        chrome();
    	chrome1();
    }

	public static void firefox() {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://google.com");
        String currenturl=driver.getCurrentUrl();
        System.out.println("current url of the page is"+currenturl);
        driver.navigate().refresh();
        
        driver.quit();
	}
	public static void chrome() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
      String S  =driver.getTitle();
      System.out.println("title of the page is"+S);
    
	if (S.equals("STORE"))

{
	System.out.println("Page Landed on Correct Website");
}
else
{
	System.out.println("Page are not Landed on Correct Website");
}
	}
	public static void chrome1() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        WebElement element=    driver.findElement(By.xpath("//input[@ id=\"searchInput\"]"));
        element.sendKeys("Artificial Intelligence");
        waitForFixTime(3000);

        element.submit();
        waitForFixTime(3000);
        //driver.findElement(By.xpath("//a[@class=\"suggestion-link\"][1]")).click();
        
   driver.findElement(By.xpath("//span[text()='History']")).click();
   String s=   driver.getTitle();
   System.out.println("the section of the title is "+s);
      
       
        
	}

	private static void waitForFixTime(int i) {
		// TODO Auto-generated method stub
		
	}
}
