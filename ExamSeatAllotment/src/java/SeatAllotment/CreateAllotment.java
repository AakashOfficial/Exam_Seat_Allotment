/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JERIN_JACOB
 */
public class CreateAllotment {
    public CreateAllotment(String classes[],int classlength,String subjectcodes[],int subjectlength,String date)
    {
        //<<INSTRUCTIONS::
        
        // date is of format 12_03_17_AN
        //fetch classes into CAClasses and subjectcodes into CASubjectcodes
        //>>
        
        
        
        //temperory variables to remove errors
         ArrayOfSubjectCode CASubjectcode=new ArrayOfSubjectCode();
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
         
         
         //fetching subject codes
         subjectlength--;
         String getsubjectcode="select * from studentlist where sub1='"+subjectcodes[subjectlength]+"' or sub2='"+subjectcodes[subjectlength]+"' or sub3='"+subjectcodes[subjectlength]+"' or sub4='"+subjectcodes[subjectlength]+"' or sub5='"+subjectcodes[subjectlength]+"' or sub6='"+subjectcodes[subjectlength]+"' or sub7='"+subjectcodes[subjectlength]+"' or sub8='"+subjectcodes[subjectlength]+"' or sub9='"+subjectcodes[subjectlength]+"' or sub10='"+subjectcodes[subjectlength]+"'";
         int rollno;
         String subj;
         String branch;
         while(subjectlength>=0)
         {
             try {
                 co.st.executeQuery(q1);
                 co.rs=co.st.executeQuery(getsubjectcode);
                 SubjectCode s1=new SubjectCode();
                 while(co.rs.next())
                 {System.out.println("here");
                     Student s=new Student();
                     s.rollNo=co.rs.getInt(1);
                     s.subjectCode=subjectcodes[subjectlength];
                     s.batch_sem=co.rs.getString(2);
                     s1.push(s);
                     
                 }
                 CASubjectcode.push(s1);
             } catch (SQLException ex) {
                 Logger.getLogger(CreateAllotment.class.getName()).log(Level.SEVERE, null, ex);
             }
               
             subjectlength--;
         }
         
         
         
        Allotment allotment=new Allotment(CAClasses, CASubjectcode);
        try{
        passingclass ps=new passingclass(allotment.axx,date);
        }
        catch(FileNotFoundException execp)
        {
            System.out.println("SeatAllotment.CreateAllotment()");
        }
    }
}
