package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver-win64\\chromedriver.exe");
		// Initialise the webdriver chrome in this case
		WebDriver driver = new ChromeDriver();
		// to automate selenium.dev website the method called get
		driver.get("https://selenium.dev/");
		// to maximize the chrome page
		driver.manage().window().maximize();
		// wait for the result
		Thread.sleep(2000);
		// to close the window
		driver.close();

	}
}
