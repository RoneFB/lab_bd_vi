import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
  
        @Test
        public void multiplicarTest(){
            Calculadora calc = new Calculadora();
            int resultado = calc.multiplicar(3,5);
            assertEquals(15, resultado);
        }


}
