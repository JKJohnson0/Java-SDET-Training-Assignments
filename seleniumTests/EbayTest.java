package seleniumTests;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Joshua\\eclipse-workspace\\WebDrivers\\geckodriver.exe");
		PrintWriter out = new PrintWriter("EbayTest.text");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		driver.findElement(By.id("gh-btn")).click();
		List<WebElement> h = driver.findElements(By.className("s-item__title"));
		List<WebElement> d = driver.findElements(By.className("s-item__price"));
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
