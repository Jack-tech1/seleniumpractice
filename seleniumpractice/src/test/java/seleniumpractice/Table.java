package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Total Number of Rows
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println(rows.size());
		List<WebElement>row=driver.findElements(By.tagName("tr"));
		System.out.println("Total Tags: "+ row.size());
		//Total Number of Columns
		List<WebElement>columns = driver.findElements(By.
				xpath("//table[@name='BookTable']//tr/th"));
		System.out.println("Total Number of Columns: "+ columns.size());
		int col=driver.findElements(By.tagName("th")).size();
		System.out.println("Total Number of columns in a single table: "+col);
		//Read Specific Data From A Cell
		String Value=driver.findElement(By.
				xpath("//table[@name='BookTable']//tr[6]/td[3]")).getText();
		System.out.println(Value);
		//Read All Value From A Table
		for(int r=2; r<=rows.size(); r++)
		{
			for(int c=1;c<=columns.size();c++)
			{
				WebElement text=driver.findElement(By.
						xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]"));
				String value=text.getText();
				System.out.print(value+ "  ");
			}
			System.out.println();
		}
		// Print Book Name Where Author Name Is Mukesh
		
		for(int r=2; r<=rows.size();r++)
		{
			String authorName=driver.findElement(By.
					xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			if(authorName.equalsIgnoreCase("Mukesh"))
			{
				String bookName=driver.findElement(By.
						xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(bookName+"  "+authorName);
			}
		}
		int total=0;
		//Find total price of all the books
		for(int r=2;r<=rows.size();r++)
		{
			String price=driver.findElement(By.
					xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			total= total+Integer.parseInt(price);
		}
		System.out.println("Total Price of Book Is: "+ total);
		
		driver.navigate().
		to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement>rows2=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		List<WebElement>columns2=driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		
		for(int r=2; r<=rows2.size();r++)
		{
			for(int c=1; c<=columns2.size();c++)
			{
				String Data=driver.findElement(By.
						xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(Data+ " ");
			}
			System.out.println();
		}
		
		driver.quit();
		

	}

}
