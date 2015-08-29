//package Testjunit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mytest {
	WebDriver driver = new FirefoxDriver();

	@Test
	public void test() {
		driver.manage().window().maximize();
		System.out.println("Window maximize");
		driver.get("http://only-testing-blog.blogspot.in/");
		System.out.print("Site open");
		driver.quit();
		System.out.println("End of Test");
		
	}

}
