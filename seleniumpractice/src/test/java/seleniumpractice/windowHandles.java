package seleniumpractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowsID=driver.getWindowHandles();
		
		for(String win:windowsID)
		{
			String Title=driver.switchTo().window(win).getTitle();
			
			if(Title.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.close();
			}
			
		}

	}

}
