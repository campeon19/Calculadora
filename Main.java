/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd2;

import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Stack<String> miStack = new StackArrayList<String>();
                Calcu calculadora = new Calcu();
                // variables
                String info = "\n";
                ArrayList numeros = new ArrayList();
                int operando1;
                int operando2 ;
                int total = 0;
                boolean bandera = true;
		// se obtiene el documento con la operacion y se almacena en una variable de tipo String
    File f = new File( "C:\\Users\\Diego Alvarez\\Desktop\\U\\Algoritmos\\HD2\\archivo.txt" );
    BufferedReader entrada;
    try {
           entrada = new BufferedReader(new FileReader(f));
           while(entrada.ready()){
                info += entrada.readLine() + "\n";
            }
    }catch (IOException e) {
            e.printStackTrace();
	}
                
    // se separa el texto ingresado             
    String palabras[]=info.trim().split(" ");
    // se agrega a un arraylist
    for(int i=0;i<palabras.length;i++){
        
        try{
            Integer.parseInt(palabras[i]);
            bandera = true;
        }catch(NumberFormatException excepcion){
            bandera = false;
        }
        
        //while(miStack.empty() != true){
            
        //}
        if (bandera == true){
            miStack.push(palabras[i]);
        }else{
            if("+".equals(palabras[i])){
               
                // se obtienen los dos operandos
                operando1 = Integer.parseInt(miStack.pop());
                operando2 = Integer.parseInt(miStack.pop());
                total = calculadora.sumar(operando1,operando2);
                // se agrega el resultado de la operacion al stack
                miStack.push(String.valueOf(total));
            }else if("-".equals(palabras[i])){
               
                // se obtienen los dos operandos
                operando1 = Integer.parseInt(miStack.pop());
                operando2 = Integer.parseInt(miStack.pop());
                total = calculadora.restar(operando1,operando2);
                // se agrega el resultado de la operacion al stack
                miStack.push(String.valueOf(total));
            }else if ("/".equals(palabras[i])){
               
                // se obtienen los dos operandos
                operando1 = Integer.parseInt(miStack.pop());
                operando2 = Integer.parseInt(miStack.pop());
                total = calculadora.dividir(operando1,operando2);
                // se agrega el resultado de la operacion al stack
                miStack.push(String.valueOf(total));
            }else if ("*".equals(palabras[i])){
                
                // se obtienen los dos operandos
                operando1 = Integer.parseInt(miStack.pop());
                operando2 = Integer.parseInt(miStack.pop());
                total = calculadora.multiplicar(operando1,operando2);
                // se agrega el resultado de la operacion al stack
                miStack.push(String.valueOf(total));
            }else{
                System.out.println("Valio verga");
            }
        }
          
    
    
    }
    System.out.println(total);
    

           
                
                
                
                
    }
    
}
