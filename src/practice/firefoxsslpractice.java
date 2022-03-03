package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class firefoxsslpractice {

	public static void main(String[] args) {
		
		
		FirefoxOptions opt =new FirefoxOptions();
		opt.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91817\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver drv =new FirefoxDriver(opt);
		drv.get("https://expired.badssl.com/");
		drv.manage().window().maximize();
		
	}

}
