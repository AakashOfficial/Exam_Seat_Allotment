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
public class ArrayOfSubjectCode {
    ArrayList a;
    int front;
    int rear;
    
    public ArrayOfSubjectCode(){
        a= new ArrayList();
        rear=0;
        front=0;
    }
    
    public void push(SubjectCode c)
    {
        a.add(c);
        rear++;
    }
    
    public int empty()
    {
        return a.size();
    }
    
    public SubjectCode pop()
    {
            if(rear>0)
            {
               Random rand = new Random();
                int  n = rand.nextInt(rear--);
                //System.out.println("SeatAllotment.ArrayOfSubjectCode.pop()"+(rear+1)+":::::::"+n);
               SubjectCode s=(SubjectCode) a.get(n);
               a.remove(n);
               return s;  
            }
            
            else
            {
                return null; 
            }
    }
}
