package pratica_03;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTestDriver {
	
	 /* Método de teste, executa o multiplicar e compara o resultado esperado 
     *   Intervalo de numeros inteiros 0 - 5
 	*	1. onde o produto de dois numeros inteiros negativos OU os dois inteiros positivos -> saida de um inteiro positivo: 
 	*	2. produto de dois inteiros, um negativo e outro positivo -> saida de um inteiro negativo 
 	*	3. Onde um dos numeros � zero o resultado esperado tem que ser zero
 	 * */
	
	
	@ParameterizedTest
	@CsvSource(value = {"5:5:25", "-5:5:-25", "-25:25:-625","-5:-5:25","5.1:-0.1:-0.51", "0:1:0", "6:-1:6"}, delimiter=':')
    public void testParticao1(float numero1, float numero2, float resultado) throws InterruptedException {
		
		/*Exeutando WebDriver Selenium*/
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
        WebDriver driver = new ChromeDriver();
        /*Abrindo p�gina web*/
        driver.get("http://localhost:8080/pratica_03/multi");
        /*Esperar para executar a��o*/
        Thread.sleep(1000);
        /*Obter usando o Name, input que ser� incluido o valor*/
        WebElement numero1Input = driver.findElement(By.name("numero1"));
        numero1Input.sendKeys(String.valueOf(numero1));/*Incluir valor no input*/
        WebElement numero2Input = driver.findElement(By.name("numero2"));
        numero2Input.sendKeys(String.valueOf(numero2));
        Thread.sleep(1000);
        /*Selecioar atrav�s do ID o bot�o que ser� usado para o envio*/
        WebElement bt = driver.findElement(By.id("enviar")); 
        bt.click();/*Executar a��o de envio*/
        Thread.sleep(1000);
        /*Obter div pelo id, que ser� exibido o valor*/
        Float resultWebDrive = Float.parseFloat(driver.findElement(By.id("result")).getText());
        assertTrue(resultWebDrive.equals(resultado));/*Inserir valor na div resultado*/
		driver.close();/*Fechar p�gina*/
        driver.quit();/*Encerrar*/
    }
	

}
