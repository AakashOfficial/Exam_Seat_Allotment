/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;


import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JERIN_JACOB
 */
public class test {
   
    public static void main(String[] args)  {
       int[] i=new int[3];
        i[0]=3;
        i[1]=3;
        i[2]=3;
        Class c;
        c = new Class(3, i, 3);
        c.Name="class1";
        ArrayOfClasses ac= new ArrayOfClasses();
        ac.push(c);
        
        i[0]=3;
        i[1]=3;
        c = new Class(3, i, 3);
        c.Name="class2";
        ac.push(c);
        
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
        
        Allotment a=new Allotment(ac, sc);
        
        System.out.println("   "+a.axx.empty());
        try{
        passingclass ps=new passingclass(a.axx,"date");
        }
        catch(FileNotFoundException e)
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
