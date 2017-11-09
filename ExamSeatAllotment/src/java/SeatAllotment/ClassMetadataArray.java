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
public class ClassMetadataArray {
    static ClassMetadata[] meta=new ClassMetadata[100];
    static int count;
    static void initialize()
    {
        for(int i=0;i<100;i++)
        {
            meta[i]=new ClassMetadata();
        }
    }
}
