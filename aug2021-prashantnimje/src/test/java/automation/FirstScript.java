package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\prashant\\fromGit\\p1\\aug2021\\src\\main\\resources\\drivers\\chromedriver_win.exe");
		String baseDir = System.getProperty("user.dir");  // So that code can run from any directory
		System.out.println("Base path : " + baseDir);
		System.setProperty("webdriver.chrome.driver",baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
		// Set the property and tell the location of webDriver

		WebDriver driver = new ChromeDriver();   //To launch Web Browser. in this case Chrome Browser

		driver.get("https://www.facebook.com");  // Navigate to URL

		System.out.println("Title is : " + driver.getTitle());   // TO get Title of webpage

		Thread.sleep(10000);   //Waiting

		driver.quit();    //To close the browser instance

	}

}
