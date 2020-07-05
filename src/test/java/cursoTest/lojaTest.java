package cursoTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lojaTest {
	WebDriver driver;
	
	public void abreNavegador() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lojaexemplod.lojablindada.com/");
	}
	
	public void fechaNavegador() {
		driver.quit();
	}
	
	@Test
	public void realizaPesquisa () {
		abreNavegador();
		WebElement pesquisa = driver.findElement(By.id("search"));
		pesquisa.sendKeys("fortaleza digital", Keys.ENTER);
		fechaNavegador();
	}

}
