package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement>checkboxes=driver.findElements
				(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Total Number of checkboxes "+ checkboxes.size());
		/*
		 * for(int i=0; i<checkboxes.size(); i++) { checkboxes.get(i).click(); }
		 */
		
		/*
		 * for(WebElement box: checkboxes) { box.click(); }
		 */
		
		/*
		 * for(int i=4; i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 */
		/*
		 * for(int i=0; i<3;i++) { checkboxes.get(i).click(); }
		 */
		
		/*
		 * for(WebElement box: checkboxes) { if(box.isSelected()) { box.click(); } else
		 * { box.click(); } } for(WebElement box: checkboxes) { if(box.isSelected()) {
		 * box.click(); } else { box.click(); } }
		 */
		
		String Day ="Thursday";
		
		switch(Day)
		{
		case "Sunday": driver.findElement(By.id("sunday")).click();
		break;
		case "Monday": driver.findElement(By.id("monday")).click();
		break;
		case "Tuesday": driver.findElement(By.id("tuesday")).click();
		break;
		case "Wednesday": driver.findElement(By.id("wednesday")).click();
		break;
		case "Thursday": driver.findElement(By.id("thursday")).click();
		break;
		case "Friday": driver.findElement(By.id("friday")).click();
		break;
		case "Saturday": driver.findElement(By.id("saturday")).click();
		break;
		default: System.out.println("Invalid Input");
		break;
		}
		
		for(int i=0; i<checkboxes.size();i++)
		{
			if(i==0 || i==2 || i==6)
			{
				checkboxes.get(i).click();
			}
		}
		
		WebElement male = driver.findElement(By.id("male"));
		WebElement female = driver.findElement(By.id("female"));
		
		System.out.println("Befor Clicking: ");
		System.out.println("Is Male Button Enabled "+ male.isEnabled());
		System.out.println("Is Female Button Enabled "+ female.isEnabled());
		System.out.println("Is Male Button Selected "+ male.isSelected());
		System.out.println("Is Female Button Selected "+ female.isSelected());
		
		male.click();
		System.out.println("After Selecting Male: ");
		System.out.println("Is Male Button Selected "+ male.isSelected());
		System.out.println("Is Female Button Selected "+ female.isSelected());
		
		female.click();
		
		System.out.println("After Selecting Female: ");
		System.out.println("Is Male Button Selected "+ male.isSelected());
		System.out.println("Is Female Button Selected "+ female.isSelected());
		
		driver.navigate().to("https://practice.expandtesting.com/radio-buttons");
		List<WebElement>radios=driver.findElements
				(By.xpath("//input[@class='form-check-input' and @type='radio']"));
		System.out.println("Total Number os Radio Buttons "+ radios.size());
		
		for(int i=0; i<radios.size(); i++)
		{
			System.out.println(radios.get(i).isEnabled());
			if(radios.get(i).isEnabled())
			{
				radios.get(i).click();
			}
		}
		
		String Color= "Yellow";
		switch(Color)
		{
		case "Blue":driver.findElement(By.id("blue")).click();
		break;
		case "Red":driver.findElement(By.id("blue")).click();
		break;
		case "Yellow":driver.findElement(By.id("blue")).click();
		break;
		case "Black":driver.findElement(By.id("blue")).click();
		break;
		case "Green":driver.findElement(By.id("blue")).click();
		break;
		case "Basketball":driver.findElement(By.id("basketball")).click();
		break;
		case "Football":driver.findElement(By.id("football")).click();
		break;
		case "Tennis":driver.findElement(By.id("tennis")).click();
		break;
		default: System.out.println("Invalid Input");
		
		}
		
		System.out.println("All Test Has Been Passed");
		driver.quit();
		
		
		
		
	}

}
