package selinumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_01 {
	@Test
	public static void test() {
		System.setProperty("webdriver""")
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
