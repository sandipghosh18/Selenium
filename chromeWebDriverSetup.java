package selleniumintroduction.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sellniumIntroduction  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Invoking Browser.
		
		//webdriver.chrome.driver--->will take the path of chrome.exe
		System.setProperty("webdriver.chrome.driver", "C://Users//Desktop//Selenium//Browser Driver//chromedriver_win32/chromedriver.exe");
		
		
		// ChromeBrowser-->ChromeDriver
		//WebDriver is an interface 

		WebDriver driver = new ChromeDriver();
		//Interface Method = new Class();
		
		//ChromeDriver is an Class
		//ChromeDriver Driver = new ChromeDriver();
		//Class Method = new Class();
		
		//driver.get()-->Host the Website
		driver.get("https://google.com");
		//driver.getTitle()--->Get the Title of the page
		String pageTitle = driver.getTitle();
		System.out.println("The Title of the page is "+pageTitle);
		
		//driver.getURL()--->Get the URL of the Page
		String pageURL =driver.getCurrentUrl();
		System.out.println("The page URL is = "+pageURL);
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		
		//Close Browser
		
		//driver.close();
		//driver.quit();
	    
		

	}

}
