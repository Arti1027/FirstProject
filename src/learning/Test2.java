package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arti.singh\\Documents\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();;//Thread.sleep(5000);
	    driver.manage().window().fullscreen();
	    driver.navigate().to ("http://myntra.com/");
	    driver.findElement(By.id(""));
	}

}

