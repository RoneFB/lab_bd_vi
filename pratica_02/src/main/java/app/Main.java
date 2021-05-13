package app;

import model.Calculadora;
//Classe que inicia a aplicação
public class Main {
    /* Método que inicia a aplicação. */
    public static void main(String [] args) {
        /* Instancia da classe Calculadora, a partir dai podemos fazer a chamada do método multiplicar */
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(8,2);
        System.out.print(resultado);
    }
    
}