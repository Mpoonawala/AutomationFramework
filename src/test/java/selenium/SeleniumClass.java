package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import generic.BaseClass;

public class SeleniumClass extends BaseClass {
	
	WebDriver driver;
	WebElement element;
	
	protected void browser(String browsername)
	{
	System.out.println("Launching" + browsername + " browser ");
	
	String currentPath = System.getProperty("user.dir");
	//System.out.println(currentPath);
	
	currentPath = currentPath + "\\src\\test\\java\\utils\\";
	
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", currentPath+"chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", currentPath+"geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver",currentPath+"IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		
	}
	else {
		System.out.println(browsername + " is incorrect");
	}
	
	
	}
	
	protected void openurl(String url) {
		System.out.println("Opening " +url+ " URL ");
		driver.get(url);
		
	}
	protected void closeBrowser() {
		driver.quit();
	}
	
	public WebElement IdentifyElement(String locatorType, String locator) {
		
		if(locatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locator));
			
		}
		else if(locatorType.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locator));
			
		}
		else if(locatorType.equalsIgnoreCase("class")) {
			element = driver.findElement(By.className(locator));
			
		}
		else if(locatorType.equalsIgnoreCase("tagname")) {
			element = driver.findElement(By.tagName(locator));
		}
		else if(locatorType.equalsIgnoreCase("linktext")) {
			element = driver.findElement(By.linkText(locator));
		}
		else if(locatorType.equalsIgnoreCase("partiallinktext")) {
			element = driver.findElement(By.partialLinkText(locator));
		}
		else if(locatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(locator));
		}
		else if(locatorType.equalsIgnoreCase("css")) {
			element = driver.findElement(By.cssSelector(locator));
		}
		else
		{
			System.out.println("Incorrect path " + locatorType);
		}
		return element;
		
		
	}
}
