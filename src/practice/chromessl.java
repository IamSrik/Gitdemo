package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromessl {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91817\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver drv = new ChromeDriver(opt);
		drv.get("https://untrusted-root.badssl.com/");
		drv.manage().window().maximize();
		
		

	}

}
