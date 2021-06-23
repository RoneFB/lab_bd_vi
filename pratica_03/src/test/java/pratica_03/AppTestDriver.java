package pratica_03;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTestDriver {
	@Test
    public void testMultiplicacao() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/pratica_03/multi");
        
        Thread.sleep(5000);
        WebElement numero1Input = driver.findElement(By.name("numero1"));
        numero1Input.sendKeys("10");
        WebElement numero2Input = driver.findElement(By.name("numero2"));
        numero2Input.sendKeys("3");
        Thread.sleep(5000);

        WebElement bt = driver.findElement(By.id("enviar"));
        bt.click();

        Thread.sleep(5000);


        String isEvenStatus = driver.findElement(By.id("result")).getText();
        assertTrue(isEvenStatus.equals("30"));
		driver.close();
        driver.quit();
    }
}
