/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

import com.itextpdf.text.DocumentException;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author gopan r g
 */
public class passingclass {

     String[] args;
  
    passingclass(ArrayOfClasses a,String date) throws FileNotFoundException
    {
        System.out.println("SeatAllotment.passingclass.<init>()");
        //int length= a.length;
        int i=0;
        Class b;
        new File("C:\\Users\\mithunlal\\Documents\\NetBeansProjects\\ExamSeatAllotment\\results\\classes-"+date).mkdir();
        new File("C:\\Users\\mithunlal\\Documents\\NetBeansProjects\\ExamSeatAllotment\\results\\Meta-classes-"+date).mkdir();
        
        ClassMetadataArray.initialize();
        
        while(a.empty()!=0)
        {
            
         b=a.pop();
         int c=b.column;
            System.out.println(c);
            int w;
         switch(c)
         {
            case 3:  colom_3 d1;
                       d1 = new colom_3(b,date);  
                           d1.Col();
                       MetaFinder2 m1;
                       m1 = new MetaFinder2(b);
                       m1.assign();
                     
                       break;
               case 4:  colom_4 d2;
                       d2 = new colom_4(b,date);  
                      
                       try {
                           d2.main(args);
                           } catch (DocumentException ex) {
                                 System.out.println(ex.getMessage());
                               }
                        MetaFinder2 m2;
                       m2 = new MetaFinder2(b);
                       m2.assign();
                                         break;
                case 5:  colom_5 d3;
                       d3 = new colom_5(b,date);  
                        
                       try {
                           d3.main(args);
                           } catch (DocumentException ex) {
                                 System.out.println(ex.getMessage());
                               }
                        MetaFinder2 m3;
                       m3 = new MetaFinder2(b);
                       m3.assign();
                      
                       break;
                case 6:  colom_6 d4;
                       d4 = new colom_6(b,date);  
                      
                       try {
                           d4.main(args);
                           } catch (DocumentException ex) {
                                 System.out.println(ex.getMessage());
                               }
                        MetaFinder2 m4;
                        
                       m4 = new MetaFinder2(b);
                       m4.assign();
                      
                       break;
                case 7:  colom_7 d5;
                       d5 = new colom_7(b,date);  
                      
                       try {
                           d5.main(args);
                           } catch (DocumentException ex) {
                                 System.out.println(ex.getMessage());
                               }
                        MetaFinder2 m5;
                       m5 = new MetaFinder2(b);
                      m5.assign();
                      
                       break;
        
         }
        }
        MetaPrinter q5;
        q5=new MetaPrinter(date);
        q5.printer();
    }
}
