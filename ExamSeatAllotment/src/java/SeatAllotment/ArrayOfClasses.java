/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author JERIN_JACOB
 */
public class ArrayOfClasses {
    ArrayList a;
    //int front;
    int rear;
    
    public ArrayOfClasses(){
        a= new ArrayList();
        rear=0;  
    }
    
    public void push(Class c)
            
    {
        a.add(c);
        rear++;
    }
    
    public int empty()
    {
        return a.size();
    }
    
    public Class pop()
    {
                Random rand = new Random();
                int  n = rand.nextInt(rear--);
                //50 is the maximum and the 1 is our minimum 
               Class s=(Class) a.get(n);   
               a.remove(n);
               return s;  
    }   
}
