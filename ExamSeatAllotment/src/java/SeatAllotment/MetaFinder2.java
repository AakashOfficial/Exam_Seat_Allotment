/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

/**
 *
 * @author JERIN_JACOB
 */
public class MetaFinder2 {
    Class q;
    
    MetaFinder2(Class q)
    {
        this.q=q;
        
    }
    
    
    
    void assign(){
        
       int maxrow = q.maxRowLength;
       int k=0,j=0,i,flag;
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
                       int w,h,flag2;   
                      for(i=0;i<ClassMetadataArray.count&&q1!=null;i++)
                         { 
                             
                            if(q1.batch_sem.equals(ClassMetadataArray.meta[i].batch))
                                    {
                                        h=0;
                                        flag2=0;
                                        flag=1;
                                        for(;h<ClassMetadataArray.meta[i].NoOfClasses;h++)
                                        {
                                            if(q.Name.equals(ClassMetadataArray.meta[i].classname[h]))
                                            {
                                                flag2=1;
                                                if(q1.rollNo< ClassMetadataArray.meta[i].rollStart[h])
                                                {
                                                    ClassMetadataArray.meta[i].rollStart[h]=q1.rollNo;
                                                }
                                                else if (q1.rollNo > ClassMetadataArray.meta[i].rollEnds[h])
                                                {
                                                    ClassMetadataArray.meta[i].rollEnds[h]=q1.rollNo;
                                                }
                                            }
                                        }
                                        
                                        if(flag2==0)
                                        {
                                            ClassMetadataArray.meta[i].classname[h]=new String(q.Name);
                                            ClassMetadataArray.meta[i].rollEnds[h]=q1.rollNo;
                                            ClassMetadataArray.meta[i].rollStart[h]=q1.rollNo;
                                            ClassMetadataArray.meta[i].NoOfClasses++;
                                        }
                                        //break;                                        
                                    }  
                        }
                     if (flag==0&&q1!=null)
                        {
                            ClassMetadataArray.count++;
                            ClassMetadataArray.meta[i].batch=new String(q1.batch_sem);
                            
                            h=0;
                                            ClassMetadataArray.meta[i].classname[h]=new String(q.Name);
                                            ClassMetadataArray.meta[i].rollEnds[h]=q1.rollNo;
                                            ClassMetadataArray.meta[i].rollStart[h]=q1.rollNo;
                                            ClassMetadataArray.meta[i].NoOfClasses++;
                            
                        }
                    }
               }
        k++;
       }
       
       
       
       
       //test printing
       for(i=0;i<ClassMetadataArray.count;i++)
       {
           System.out.println(ClassMetadataArray.meta[i].batch);
           for(j=0;j<ClassMetadataArray.meta[i].NoOfClasses;j++)
           {
               System.out.println(ClassMetadataArray.meta[i].classname[j]+"   "+ClassMetadataArray.meta[i].rollStart[j]+"   "+ClassMetadataArray.meta[i].rollEnds[j]);
           }
       }
       
     
    }
    

}
