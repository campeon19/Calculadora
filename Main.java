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
                Stack<String> miStack = new StackFunction<String>();
                String info = "\n";
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
                System.out.println(info);
    }
    
}
