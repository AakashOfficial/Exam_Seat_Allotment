/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

import java.util.ArrayList;

/**
 *
 * @author JERIN_JACOB
 */
public class Allotment {
   ArrayOfClasses axx;
    public Allotment(ArrayOfClasses c,ArrayOfSubjectCode s){
        axx=new ArrayOfClasses();
 
        ArrayOfSubjectCode leftover=new ArrayOfSubjectCode();
        ArrayOfSubjectCode templeftover=new ArrayOfSubjectCode();
        Class c1;
        SubjectCode s1;
        Student Stu;
        int Flag=0;
        //System.err.println("ok");
               //System.err.println("here1");
        while(c.empty()!=0)
        { 
            c1=c.pop();//selecting a classroom
            Flag=0;
                   //System.err.println("here2");
             while((s.empty()!=0||leftover.empty()!=0)&&Flag==0)
            {
                       
                if(leftover.empty()!=0)  //to check whether there is any leftover SubjectCode
                {   
                    s1=leftover.pop();
                }
                else
                {
                    s1=s.pop();
                    //System.err.println("here4");
                }
                
                
                
                
                
                int firstTime=0;//entering loop for fisrt time
                while((s1!=null&&s1.empty()!=0)&&Flag==0)
                {
                    Marker m;
                    m=c1.next();
                    
                    
                    if(c1.PredictNext()==null&&firstTime==0&&c1.flagForChangeMarker!=1&&m!=null)
                    {
                         c1.changeMarker();
                         continue;
                    }
                    
                    
                    
                    if(m!=null)
                    {
                        System.out.print("Marker "+m.i+"  "+m.j+"  "+m.k+"  flag:"+Flag);
                        Stu=s1.pop();
                        c1.allot(m,Stu);
                        System.out.println("  Student   "+Stu.rollNo+"  sub: "+Stu.subjectCode+" class: "+c1.Name);
                    }
                    else{
                        
                        System.out.println("xxxxx");
                            if(c1.flagForChangeMarker==1)
                            {
                                Flag=1;
                            }
                            else
                            {
                                c1.changeMarker();
                                System.out.println("MarkerNull");
                                if(firstTime==1)
                                {
                                    templeftover.push(s1);//to push left over if no seats availiable in class
                                }
                                else
                                {
                                    System.out.println("Putting to leftover");
                                    leftover.push(s1);
                                }
                                s1=null;
                            }
                           
                        
                        
                    }
                    firstTime=1;//changing firstTime on first entry
                }
                System.out.println("out");
            
            }
             while(templeftover.empty()!=0)
             {
                 s1=templeftover.pop();
                 leftover.push(s1);
             }
             axx.push(c1);
        }

    }
    

}
