/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd2;



/**
 *
 * @author Diego Alvarez
 */
public class Calcu implements Calculadora{
    int resultado;
    
    public int sumar(int operando1, int operando2){
        resultado = operando1 + operando2;  
        return resultado;
    }
    
    public int restar(int operando1, int operando2){
        resultado = operando1 - operando2;  
        return resultado;
    }
    
    public int multiplicar(int operando1, int operando2){
        resultado = operando1 * operando2;  
        return resultado;
    }
    
    public int dividir(int operando1, int operando2){
        resultado = operando1 / operando2;  
        return resultado;
    }
    
}
