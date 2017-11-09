/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

/**
 *
 * @author Gopan R G
 */

public class MetaFinder {
    StaticMetaClass[] a = new StaticMetaClass[100];
     public static int n1; 
     Class q;
     int i=0,flag=0;
     
    MetaFinder(Class q)
    {
//      n1=StaticMetaClass.n;
      
      this.q=q;
    }
    void assign(){
        
       int maxrow = q.maxRowLength;
       int k=0,j=0;
       q.ReadyForPdf();
        
       int c=q.column;
        Student q1;
       while(k<maxrow){
            for(int j1=0;j1<c;j1++)
               {
                for(int k1=0;k1<q.seatType;k1++)
                    {
                     
                      q1=q.nextForPdf();
                      i=0;
                      flag=0;
                       int w;   
                      for(i=0;i<n1&&q1!=null;i++)
                         { 
                             
                            if(q1.batch_sem.equals(StaticSubMetaClass.meta[i].metaclass))
                                    {
                                        flag=1;
                                        j=StaticSubMetaClass.meta[i].i;
                                        
                                        if(q1.rollNo< StaticSubMetaClass.meta[i].start[j])
                                        {
                                             StaticSubMetaClass.meta[i].start[j]=q1.rollNo;
                                        }
                                        else if (q1.rollNo > a[i].end[j]){
                                             StaticSubMetaClass.meta[i].end[j]=q1.rollNo;
                                          }
                                       
                                        //break;                                        
                                    }  
                        }
                     if (flag==0){
                         StaticMetaClass.n=StaticMetaClass.n+1;
                                  n1=StaticMetaClass.n;
                                  
                              try{
                                  StaticSubMetaClass.meta[i].metaclass=new String(q1.batch_sem);
                             
                              }
                              catch(Exception e)
                              {
                                  System.out.println(e.getMessage());
                                  System.out.println("\n@@"+i);
                                  System.out.println("\n!!"+n1);
                                  System.out.println("$$"+q1.batch_sem+"\n");
                              }
                              StaticSubMetaClass.meta[i].i=0;
                             j=StaticSubMetaClass.meta[i].i;
                             StaticSubMetaClass.meta[i].start[j]=q1.rollNo;
                              StaticSubMetaClass.meta[i].end[j]=q1.rollNo;
                              StaticSubMetaClass.meta[i].eclass[j] = q.Name;
                              StaticMetaClass.n=StaticMetaClass.n+1;
                            }
                    }
               }
        k++;
       }
       
     
    }
    
}