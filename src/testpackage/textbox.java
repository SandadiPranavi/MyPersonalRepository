package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://github.com/login");
		//Thread.sleep(3000);
		WebElement Username = driver.findElement(By.id("login_field"));
		if(Username.isDisplayed()) {
			if(Username.isEnabled()) {
				Username.sendKeys("spranavi148@gmail.com");
				Thread.sleep(3000);
			}
			else {
				System.err.println("txt box is not enabled");
			}
		}
		else {
			System.err.println("no txt box didplayed");
		
		}
		
		WebElement Password = driver.findElement(By.id("password"));
		if(Password.isDisplayed()) {
			if(Password.isEnabled()) {
				Password.sendKeys("$Bynsunanda$410");
				Thread.sleep(3000);
			}
			else {
				System.err.println("txt box is not enabled");
			}
		}
		else {
			System.err.println("no txt box didplayed");
		
			
		}
		WebElement Signin = driver.findElement(By.name("commit"));
		if(Signin.isDisplayed()) {
			if(Signin.isEnabled()) {
				Signin.click();
				Thread.sleep(3000);
			}
			else {
				System.err.println("txt box is not enabled");
			}
		}
		else {
			System.err.println("no txt box didplayed");
		
		}
		
		
		System.out.println("Done");

	}

}
