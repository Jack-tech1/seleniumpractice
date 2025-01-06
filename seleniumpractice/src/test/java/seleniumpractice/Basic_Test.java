package seleniumpractice;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Basic_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String act_Title=driver.getTitle();
		if(act_Title.equalsIgnoreCase("Your Stor"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println(image.size());
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links: "+ links.size() );
		
		driver.findElement(By.linkText("Tablets")).click();
		driver.close();

	}

}
