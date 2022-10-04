package seleniumTests;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TargetTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Joshua\\eclipse-workspace\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		PrintWriter out = new PrintWriter("TargetTest.text");

		driver.get("https://www.target.com/");
		driver.findElement(By.id("search")).sendKeys("iphone");
		driver.findElement(By.cssSelector(".styles__SearchButton-sc-srf2ow-7")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> h = driver.findElements(By.className("Truncate-sc-10p6c43-0 dWgRjr"));
		List<WebElement> d = driver.findElements(By.className("h-padding-r-tiny"));
		for(int i = 0; i < h.size(); i++) {
			String header = h.get(i).getText();	
			String desc = d.get(i).getText();
			out.println(header);
			out.println(desc);
		}
		out.flush();
		out.close();
		
	}

}
