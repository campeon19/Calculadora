/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd2;

import java.util.ArrayList;

public class StackFunction<E> implements Stack<E>{
   protected ArrayList<E> data;
   
   public StackFunction(){
       // post: constructs a new, empty stack
	data = new ArrayList<E>();
   }
   
   public void push(E item){
   // post: the value is added to the stack
   // will be popped next if no intervening pushpush
       data.add(item);
   }
   
   
   public E pop(){
       // pre: stack is not empty
       // post: most recently pushed item is removed and returned
       return data.remove(size()-1);
   }
   
   public E peek(){
       // pre: stack is not empty
       // post: top value (next to be popped) is returned
       return data.get(size() - 1);
   }

   
   public boolean empty(){
       // post: returns true if and only if the stack is empty
       return size() == 0;
   }
   
   
   public int size(){
       // post: returns the number of elements in the stack
       return data.size();
      
   }
 
    
    
    
}
