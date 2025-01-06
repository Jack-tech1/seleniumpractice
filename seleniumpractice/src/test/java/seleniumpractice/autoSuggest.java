package seleniumpractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> all=driver.findElements(By.xpath("//ul//li//div[@role='option']"));
		System.out.println(all.size());
		for(WebElement opt: all)
		{
			System.out.println(opt.getText());
		}
		for(WebElement opt:all)
		{
			
			if(opt.getText().equalsIgnoreCase("Selenium"))
			{
				opt.click();
				break;
			}
		}
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("cricbuzz");
		List<WebElement> cric= driver.findElements(By.xpath("//ul//div[@role='option']"));
		System.out.println(cric.size());
		for(WebElement s:cric)
		{
			System.out.println(s.getText());
		}
		for(WebElement s: cric)
		{
			if(s.getText().equalsIgnoreCase("Cricbuzz"))
			{
				s.click();
				break;
			}
		}
		System.out.println("All Test Has Been Passed");
		driver.quit();
		

	}

}
