/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;


import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JERIN_JACOB
 */
public class test2 {
   
    public static void main(String[] args)  {


                // ArrayOfSubjectCode CASubjectcode=new ArrayOfSubjectCode();
                int classlength=1;
                String classes[]={"c2"};
         ArrayOfClasses CAClasses= new ArrayOfClasses();
         //end of temporary variables
         Connectivity co=new Connectivity();
         co.connect();
         int p=0,rowcount;
         String a,k;
         int b,c,d,e,f,g,h,i,j;
         String q1="use mysql";
         classlength--;
         while(classlength>=0)
         {
         String getclass="select * from class where name='"+classes[classlength]+"'";
         try {
                co.st.executeQuery(q1);
                co.rs=co.st.executeQuery(getclass);
                while(co.rs.next())
                {
                    a=co.rs.getString(1);
                    b=co.rs.getInt(2);
                    j=co.rs.getInt(10);
                    k=co.rs.getString(11);
                    rowcount=b;
                    int[] i1=new int[rowcount];
                    int q;
                    for(p=0,q=3;p<rowcount;p++)
                    {
                        i1[p]=co.rs.getInt(q);
                        q++;
                    }
                    Class c1 = new Class(b, i1, j);
                    c1.Name=a;
                    
                    CAClasses.push(c1);
                }
        } catch (SQLException ex) {
            Logger.getLogger(fetchclass.class.getName()).log(Level.SEVERE, null, ex);
        }
         classlength--;
         }

        
        
        ArrayOfSubjectCode sc=new ArrayOfSubjectCode();
        
        SubjectCode sub=new SubjectCode();
        
        
        Student s=new Student();
        s.rollNo=11;
        s.batch_sem="firstBranch";
        s.subjectCode="firstSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=12;
        s.batch_sem="firstBranch";
        s.subjectCode="firstSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=13;
        s.batch_sem="firstBranch";
        s.subjectCode="firstSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=14;
        s.batch_sem="firstBranch";
        s.subjectCode="firstSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=15;
        s.batch_sem="firstBranch";
        s.subjectCode="firstSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=16;
        s.batch_sem="firstBranch";
        s.subjectCode="firstSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=17;
        s.batch_sem="firstBranch";
        s.subjectCode="firstSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=18;
        s.batch_sem="firstBranch";
        s.subjectCode="firstSubj";
        sub.push(s);
        
        sc.push(sub);
        
        sub=new SubjectCode();
        
        s=new Student();
        s.rollNo=21;
        s.batch_sem="secondBranch";
        s.subjectCode="secondSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=22;
        s.batch_sem="secondBranch";
        s.subjectCode="secondSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=23;
        s.batch_sem="secondBranch";
        s.subjectCode="secondSubj";
        sub.push(s);
        
        sc.push(sub);
        
        sub=new SubjectCode();
        
        s=new Student();
        s.rollNo=31;
        s.batch_sem="thirdBranch";
        s.subjectCode="thirdSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=32;
        s.batch_sem="thirdBranch";
        s.subjectCode="thirdSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=33;
        s.batch_sem="thirdBranch";
        s.subjectCode="thirdSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=34;
        s.batch_sem="thirdBranch";
        s.subjectCode="thirdSubj";
        sub.push(s);
        
        sc.push(sub);
        
        sub=new SubjectCode();
        
        s=new Student();
        s.rollNo=41;
        s.batch_sem="fourthBranch";
        s.subjectCode="fourthSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=42;
        s.batch_sem="fourthBranch";
        s.subjectCode="fourthSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=43;
        s.batch_sem="fourthBranch";
        s.subjectCode="fourthSubj";
        sub.push(s);
        
        s=new Student();
        s.rollNo=44;
        s.batch_sem="fourthBranch";
        s.subjectCode="fourthSubj";
        sub.push(s);
        
        sc.push(sub);
        
        Allotment acc=new Allotment(CAClasses, sc);
        
        System.out.println("   "+acc.axx.empty());
        try{
        passingclass ps=new passingclass(acc.axx,"date");
        }
        catch(FileNotFoundException ec)
        {
            System.out.println("SeatAllotment.test.main()");
        }
        
        

        
        
        
        
//        Connectivity cn=new Connectivity();
//                       cn.connect();
//                       String l="use mysql";
//                       String q="create table class(";
//                       try{
//                           cn.st.executeQuery(l);
//                           cn.st.executeUpdate(q);
//                           
//                       }catch(SQLException evt)
//                       {
//                            System.out.println(evt.getMessage());
//                        }
                       
                       
                       
                       
//        System.out.println("\n\n\n\n\n::::::::::::::::::::::");

//while(a.axx.rear>0)
//{
//    Class cv=a.axx.pop();
//    cv.ReadyForPdf();
//    while(cv.nextForPdf()!=null)
//    System.out.println(" "+cv.nextForPdf().rollNo);
//    //System.out.println(" "+cv.nextForPdf().rollNo);
//}
        
    }
    
    
    
 
    
}
