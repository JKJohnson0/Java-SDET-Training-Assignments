package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TargetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Joshua\\eclipse-workspace\\WebDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	}

}
