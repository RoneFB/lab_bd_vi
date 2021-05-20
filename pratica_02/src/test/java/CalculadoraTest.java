import org.junit.jupiter.api.Test;

import model.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculadoraTest {
  
        @Test
        public void multiplicarTest(){
            /* MÃ©todo de teste, executa o multiplicar e compara o resultado esperado */
        	/* 
        	 * Intervalo -5 a +5
        	 * 
        	 * Resultando o intervalo temos duas partições de equivalência, 
        	 * 1 - onde o produto de dois numeros inteiros negativos OU os dois inteiros positivos -> saida de um inteiro positivo
        	 * 2 - produto de dois inteiros, um negativo e outro positivo -> saida de um inteiro positivo  
        	 * */
            Calculadora calc = new Calculadora();
           
            int resultado = calc.multiplicar(2,2);
            assertEquals(4, resultado);
            
            int resultado2 = calc.multiplicar(-1,-1);
            assertEquals(1, resultado2);
            
            int resultado3 = calc.multiplicar(-1,6);
            assertEquals(-6, resultado3);
            
            int resultado4 = calc.multiplicar(0,2);
            assertEquals(0, resultado4);
            
            assertTrue(calc.multiplicar(-2, 0) >= 0);
        }


}
