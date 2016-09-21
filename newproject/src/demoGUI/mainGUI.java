package demoGUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mainGUI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.facebook.com";
		String expectedTitle = "FACEBOOK";
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		if (actualTitle.equals(expectedTitle)){
		System.out.println("Test Passed");
		}
		else {
		System.out.println("Test Failed");
		}
		
		driver.close();
		System.exit(0);
	}
}