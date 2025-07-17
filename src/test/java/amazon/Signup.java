package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		String url = "https://spcentral.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fspcentral.amazon.in%2Faccount%2F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_spc_desktop_in&openid.mode=checkid_setup&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=amzn_spc_desktop_in&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create your Amazon account")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Eshika batham");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Eshika234@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("234567");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("234568");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
}
