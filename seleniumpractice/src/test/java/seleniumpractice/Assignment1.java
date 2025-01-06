package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/index.html");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links Are: "+ links.size());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Number of Images Are: "+ images.size());
		driver.findElement(By.cssSelector("a.nav-link[href=\"index.html\"]")).click();
		System.out.println("Test Passed");

	}

}
