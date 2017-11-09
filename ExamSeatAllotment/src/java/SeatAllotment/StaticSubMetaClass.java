/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;


public class StaticSubMetaClass extends StaticMetaClass {
    
  public static StaticMetaClass[] meta = new StaticMetaClass[100];
  public static void initialize()
  {
      for(int i=0;i<100;i++)
          meta[i]=new StaticMetaClass();
  }

}
