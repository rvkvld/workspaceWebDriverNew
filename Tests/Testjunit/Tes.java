package Testjunit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tes {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		System.out.println("Window miximazed");
		driver.quit();
		System.out.println("Driver quite");
		
	}

}
