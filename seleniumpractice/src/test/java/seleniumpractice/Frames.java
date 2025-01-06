package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		WebElement Name=driver.findElement(By.id("name"));
		Name.sendKeys("Hello");
		WebElement frm1 = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frm1);
		Select dropdown = new Select(driver.findElement(By.id("course")));
		dropdown.selectByVisibleText("Python");
		driver.switchTo().defaultContent();
		Name.clear();
		Name.sendKeys("My Boy");
		driver.switchTo().frame(frm1);
		dropdown.selectByVisibleText("Java");
		

	}

}
