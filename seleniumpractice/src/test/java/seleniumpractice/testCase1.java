package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch browser
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Navigate to url 'http://automationexercise.com'
		
		driver.get("https://automationexercise.com/");
		
		//Verify that home page is visible successfully
		
		boolean flag=driver.findElement(By.linkText("Home")).isDisplayed();
		System.out.println("Home page is visible (true or false): "+flag);
		
		//Click on 'Signup / Login' button
		
		driver.findElement(By.linkText("Signup / Login")).click();
		
		//Verify 'New User Signup!' is visible
		
		boolean flag1=driver.findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed();
		System.out.println("New User Signup! is visible(true or false): "+flag1);
		
		//Enter name and email address
		
		WebElement Name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
		Name.sendKeys("Cracky");
		WebElement Email= driver.findElement(By.xpath("//input[@placeholder='Email Address' and @data-qa='signup-email']"));
		Email.sendKeys("abcd54321se54hgtyx65@gmail.com");
		
		//Click 'Signup' button
		
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		//Verify that 'ENTER ACCOUNT INFORMATION' is visible
		
		boolean flag2=driver.findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed();
		System.out.println("ENTER ACCOUNT INFORMATION(true or false): "+ flag2);
		
		//Fill details: Title, Name, Email, Password, Date of birth
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("Qwerty7766");
		Select dateDropDown = new Select(driver.findElement(By.id("days")));
		dateDropDown.selectByVisibleText("21");
		Select monthDropDown = new Select(driver.findElement(By.id("months")));
		monthDropDown.selectByVisibleText("January");
		Select yearDropDown = new Select(driver.findElement(By.id("years")));
		yearDropDown.selectByVisibleText("2000");
		
		//Select checkbox 'Sign up for our newsletter!'
		
		driver.findElement(By.id("newsletter")).click();
		
		//Select checkbox 'Receive special offers from our partners!'
		
		driver.findElement(By.id("optin")).click();
		
		//Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
		
		driver.findElement(By.id("first_name")).sendKeys("Cracky");
		driver.findElement(By.id("last_name")).sendKeys("Jack");
		driver.findElement(By.id("company")).sendKeys("Synechron");
		driver.findElement(By.id("address1")).sendKeys("100 church street");
		driver.findElement(By.id("address2")).sendKeys("New York");
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("United States");
		driver.findElement(By.id("state")).sendKeys("New York State");
		driver.findElement(By.id("city")).sendKeys("New York");
		driver.findElement(By.id("zipcode")).sendKeys("12345");
		driver.findElement(By.id("mobile_number")).sendKeys("7788009911");
		
		// Click 'Create Account button'
		
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		
		//Verify that 'ACCOUNT CREATED!' is visible
		
		boolean flag3=driver.findElement(By.xpath("//b[text()='Account Created!']")).isDisplayed();
		System.out.println("ACCOUNT CREATED!(true or false): "+ flag3);
		
		//Click 'Continue' button
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		//Verify that 'Logged in as username' is visible
		
		boolean flag4=driver.findElement(By.xpath("//b[text()='Cracky']")).isDisplayed();
		System.out.println("Logged in as username(true or false): "+flag4);
		
		//Click 'Delete Account' button
		
		driver.findElement(By.linkText("Delete Account")).click();
		
		//Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
		
		boolean flag5=driver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed();
		System.out.println("'ACCOUNT DELETED!' is visible(true or false): "+flag5);
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		System.out.println("Everything has passed");
		driver.quit();
		
		
		

	}

}
