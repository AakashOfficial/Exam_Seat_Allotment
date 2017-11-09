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
public class Rows {
    int rows;
    Seats[] s;
     void generate(int R,int seatType)
    {
        try{
                //Rows are arrays of Seats
            rows=R;
            s=new Seats[rows];
//                System.out.println("r="+rows+"\n");
            for(int i = 0;i<rows;i++)
                {
                    s[i]=new Seats();
                    s[i].generateS(seatType);
//                    System.out.println("rows::::"+i+"\n");
                }
        
        }
        catch(NullPointerException e)
        {
            System.out.println("SeatAllotment.Rows.generate()");
        }
    }

    
}
