package MySeleniumSessionsClasses.MySeleniumSessionsClasses.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleUtils {

	public String getTitle() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		driver.close();
		return title;
		
	}
	
	public String getUrlSearch() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement barra = driver.findElement(By.name("q"));
		barra.sendKeys("webdriver");
		barra.submit();
		String url=driver.getCurrentUrl();
		driver.close();
		return url;
	}
	
	public boolean isQueryBarBlank() {
		boolean flag=false;
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement barra = driver.findElement(By.name("q"));
		barra.sendKeys("webdriver");
		barra.submit();
		if(driver.findElement(By.name("q")).getText().isEmpty()) {
			flag=true;
		}
		driver.close();
		return flag;
	}
	
	public String calculate(String a,String b) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		WebElement query = driver.findElement(By.name("q"));
		query.sendKeys(a+"+"+b,Keys.ENTER);
		WebElement barra = driver.findElement(By.id("cwos"));
		
		
		String result =  barra.getText();
		System.out.println("------Resultado de la suma= "+result);
		driver.close();
		return result;
	}
	
}
