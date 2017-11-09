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
public class Seats {
    Student[] seats;
    public void generateS(int n)
    {
        try{
            //Seats is an array of Student(s)
//            System.out.println("Seats::"+n+"\n");
            seats=new Student[n];
            for(int i=0;i<n;i++)
                {
//                     seats[i]= new Student();
                     seats[i].rollNo=0;
                }
            }
        catch(NullPointerException e)
        {
            System.out.println("SeatAllotment.Seats.generateS()");
        }
    }
}
