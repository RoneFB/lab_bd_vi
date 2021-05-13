package model;

/*Classe responsável por conter métodos de operações matemáticas*/
public class Calculadora {
    
    /*método que recebe dois valores inteiros e retorna o produto desses dois valor*/
    public int multiplicar(int n1, int n2){
        int mult = Math.multiplyExact(n1, n2);
        return mult;
    }
   
}