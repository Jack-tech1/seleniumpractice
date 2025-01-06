package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		WebElement dropDown= driver.findElement(By.id("country"));
		Select DD = new Select(dropDown);
		//DD.selectByVisibleText("United States");
		//DD.selectByValue("germany");
		
		List<WebElement> options=DD.getOptions();
		System.out.println(options.size());
		for(WebElement op: options)
		{
			
			System.out.println(op.getText());
			if(op.getText().equals("China"))
			{
				op.click();
			}
		}
		
		WebElement color = driver.findElement(By.id("colors"));
		Select colors = new Select(color);
		List<WebElement>colorDrop= colors.getOptions();
		System.out.println(colorDrop.size());
		for(WebElement col:colorDrop)
		{
			if(col.getText().equals("Green"))
			{
				col.click();
			}
		}
		driver.navigate().to("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,multi)]")).click();
		driver.findElement(By.xpath("//input[@value='Bootstrap']")).click();
		List<WebElement>lists=driver.findElements(By.xpath("//ul//input[@type='checkbox']"));
		System.out.println("Total Number of Values: "+ lists.size());
		for(WebElement op: lists)
		{
			String value= op.getText();
			System.out.println(value);
		}
		for(WebElement single: lists)
		{
			//System.out.println(single.getText());
			
			if(single.isSelected())
			{
				single.click();
			}
		}
		
		driver.navigate().to("https://demoqa.com/select-menu");
		for(WebElement single: lists)
		{
			if(!single.isSelected())
			{
				single.click();
			}
		}
		System.out.println("All Test Has Been Passed");
		driver.quit();
		

	}

}
