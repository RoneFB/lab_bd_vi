package model;

/*Classe respons�vel por conter m�todos de opera��es matem�ticas*/
public class Calculadora {
    
    /*m�todo que recebe dois valores inteiros e retorna o produto desses dois valor*/
    public int multiplicar(int n1, int n2){
        int mult = Math.multiplyExact(n1, n2);
        return mult;
    }
   
}