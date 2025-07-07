import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookreg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Eshika");
		driver.findElement(By.name("lastname")).sendKeys("Batham");
		Thread.sleep(2000);
		//drop down selection
		//by text
		WebElement item = driver.findElement(By.id("day"));
		Select obj = new Select(item);
		obj.selectByVisibleText("14");
		//by index
		WebElement item2 = driver.findElement(By.id("month"));
		Select obj1 = new Select(item2);
		obj1.selectByIndex(7);
		//by value
		WebElement item3 = driver.findElement(By.id("year"));
		Select obj2 = new Select(item3);
		obj2.selectByValue("2016");
		Thread.sleep(3000);
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")).sendKeys("8305572822");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("eshika90");
		}

	

			}


