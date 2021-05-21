import org.junit.jupiter.api.Test;

import model.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculadoraTest {
  
        @Test
        public void multiplicarTest(){
            /* MÃ©todo de teste, executa o multiplicar e compara o resultado esperado 
            *   Intervalo de numeros inteiros 0 - 5
            *   
        	*	Resultando o intervalo temos três partições de equivalência: 
        	*	1. onde o produto de dois numeros inteiros negativos OU os dois inteiros positivos -> saida de um inteiro positivo: 
        	*	|Ex: |2 * 2 = 4 | -2 * -2 = 4 |
        	*	|[1, 2, 3 ...]|

        	*	2. produto de dois inteiros, um negativo e outro positivo -> saida de um inteiro negativo 
        	*	|Ex: | -2 * 2 = -4 |
        	*	|[-1,-2,-3 ...]|

        	*	3. Onde um dos numeros é zero o resultado esperado tem que ser zero
        	*	|Ex: |3 * 0 = 0|
        	*	|[0]|
        		
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
            
            
        }


}
