import org.junit.jupiter.api.Test;

import model.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
  
        @Test
        public void multiplicarTest(){
            /* Método de teste, executa o multiplicar e compara o resultado esperado */
            Calculadora calc = new Calculadora();
            int resultado = calc.multiplicar(6999,67849);
            assertEquals(474875151, resultado);
        }


}
