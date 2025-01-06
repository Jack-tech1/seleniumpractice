package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		WebElement userName = driver.findElement(By.cssSelector("input#user-name"));
		WebElement passWord = driver.findElement(By.cssSelector("input.input_error[name=\"password\"]"));
		WebElement logIn = driver.findElement(By.cssSelector("input[value=\"Login\"]"));
		userName.sendKeys("standard_user");
		passWord.sendKeys("secret_sauce");
		logIn.click();
		

	}

}
