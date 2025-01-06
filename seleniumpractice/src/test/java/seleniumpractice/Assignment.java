package seleniumpractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input.wikipedia-search-button")).click();
		List<WebElement>links=driver.findElements(By.
				xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
		for(WebElement link: links)
		{
			System.out.println("Total Number of links are: "+ links.size());
			System.out.println("These are links: "+link.getText());
			link.click();
		}
		Set<String>windowsID=driver.getWindowHandles();
		
		for(String win: windowsID)
		{
			String id=driver.switchTo().window(win).getWindowHandle();
			System.out.println("ID: "+ id);
			String Title=driver.switchTo().window(win).getTitle();
			if(Title.equals("Selenium - Wikipedia") || 
			   Title.equals("Selenium in biology - Wikipedia") ||
			   Title.equals("Selenium (software) - Wikipedia"))
			{
				driver.close();
			}
			
		}
		
		

	}

}
