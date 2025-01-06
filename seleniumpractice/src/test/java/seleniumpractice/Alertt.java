package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		//driver.findElement(By.xpath("//div[@id='OKTab']/button[@class='btn btn-danger']")).click();
		
		//myAlert.accept();
		/*
		 * driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click()
		 * ; driver.findElement(By.
		 * xpath("//div[@id='CancelTab']/button[@class='btn btn-primary']")).click();
		 * Alert myAlert=driver.switchTo().alert(); Thread.sleep(3000);
		 * //myAlert.accept(); System.out.println(myAlert.getText());
		 * 
		 * myAlert.accept(); String
		 * text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		 * System.out.println("You Pressed: "+ text);
		 */
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//div[@id='Textbox']/button[@class='btn btn-info']")).click();
		Alert myAlert=driver.switchTo().alert();
	//	Thread.sleep(3000);
		myAlert.sendKeys("Hello Testing");
		myAlert.accept();
		String text=driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println(text);
		
		
		
		

	}

}
