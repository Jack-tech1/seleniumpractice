package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

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
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.xpath("//a[contains(@data-test,'about')]")).click();
		
		boolean status=driver.findElement(By.xpath("//h3[text()='Sauce Labs Platform for Test']")).
		isDisplayed();
		System.out.println("Text status with text or inner text method: "+status);
		driver.findElement(By.xpath("//button[text()='Learn more']")).click();
		driver.navigate().to("https://demo.opencart.com/");
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Mobile");
		System.out.println("Test Passed");
		

	}

}
