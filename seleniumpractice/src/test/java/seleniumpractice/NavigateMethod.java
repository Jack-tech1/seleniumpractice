package seleniumpractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.opencart.com/?route=account/login");
		driver.findElement(By.linkText("Features")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		URL myLink = new URL("https://the-internet.herokuapp.com/");
		driver.navigate().to(myLink);
		driver.close();
		System.out.println("All Test Has Been Passed");
		
		

	}

}
