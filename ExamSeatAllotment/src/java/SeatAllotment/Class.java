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
public class Class {
    int column;
    String Name;
    Rows[] rows;
    int maxRowLength;
    int seatType;
    Marker m;
    int MarkerSeatCount;
    int flagForChangeMarker;
    
    public Class(int col,int r[],int seatType1)
            {
                    MarkerSeatCount=1;
                    flagForChangeMarker=0;
                    m=new Marker();
                    m.i=0;
                    m.j=-1;
                    m.k=0;
                    seatType=seatType1;
                    column=col;
                     
                    rows=new Rows[col];
                try{
                        //Class is an array of Rows
                    for(int i = 0;i<col;i++)
                    {
                        rows[i]=new Rows();
                        rows[i].generate(r[i],seatType1);
                    }
                }
                catch(NullPointerException e)
                {
                    System.out.println("SeatAllotment.Class.<init>()");
                }
            }

   
    public Marker next ()
    {
        //Marker temp=new Marker();
        if(m.j+1!=this.rows[m.i].rows)
        {
            m.j++;
        }
        else
        {
                if(m.k+2>=seatType)
                {
                    if(m.i+1>=column)
                    {
                        //push into leftover
                        return null;
                        
                    }
                    else
                    {
                        m.i++;
                        m.k+=2;
                        m.k=m.k%seatType;
                        //System.out.println(m.k+":::::");
                        m.j=0;
                    }
                }
                else
                {
                    m.k+=2;
                    m.j=0;
                }
        }
        
        return m;
    }
    


    public Marker PredictNext ()
    {
        Marker kl=new Marker();
        kl.i=m.i;
        kl.j=m.j;
        kl.k=m.k;
        if(kl.j+1!=this.rows[kl.i].rows)
        {
            kl.j++;
        }
        else
        {
                if(kl.k+2>=seatType)
                {
                    if(kl.i+1>=column)
                    {
                        //push into leftover
                        return null;
                        
                    }
                    else
                    {
                        kl.i++;
                        kl.k+=2;
                        kl.k=kl.k%seatType;
                       
                        kl.j=0;
                    }
                }
                else
                {
                    kl.k+=2;
                    kl.j=0;
                }
        }
        
        return kl;
    }

    
    void changeMarker()
    {
        flagForChangeMarker=1;
        if(seatType==3)
        {
        m.i=0;
        m.j=-1;
        m.k=1;
        }
        else
        {
            return;
        }
    }
    
    
    void allot(Marker mi,Student s)
    {
        rows[mi.i].s[mi.j].seats[mi.k]=s;
    }
    
    
    ClassMetadata getMetadata()
    {
        ClassMetadata cm=new ClassMetadata();
        Marker resetMarker=m;
        m.i=0;
        m.j=0;
        m.k=0;
        Student s=rows[m.i].s[m.j].seats[m.k];
        
        while(next()!=null)
        {
            s=rows[m.i].s[m.j].seats[m.k];
            
        }
        
        return cm;
    }
    
    int ReadyForPdf()
    {
        maxRowLength=rows[0].rows;
        for(int i=1;i<column;i++)
        {
            if(rows[i].rows>maxRowLength)
            {
                maxRowLength=rows[i].rows;
            }
        }
        m.i=0;
        m.j=0;
        m.k=0;
        return maxRowLength;
    }
    
    Student nextForPdf()
    {
        if(m.k<seatType)
        {
            
            
            
            
            try{
            if(rows[m.i].s[m.j].seats[m.k]==null)
            {
                m.k++;
                return null;
            }
            }
            catch(Exception e)
            {
                m.k++;
                return null;
            }
            
            
            
            
            
            return rows[m.i].s[m.j].seats[m.k++];
        }
        else
        {
            if(m.i<column-1)
            {
                m.i++;
                m.k=0;
                
                
                
                
                try{
                if(rows[m.i].s[m.j].seats[m.k]==null)
                {
                    m.k++;
                    return null;
                }
                }
            catch(Exception e)
            {
                m.k++;
                return null;
            }
                
                
                
                
                return rows[m.i].s[m.j].seats[m.k++];
            }
            else
            {
                if(m.j+1>maxRowLength)
                {
                    return null;
                }
                else
                {
                    if(m.j>=rows[m.i].rows)
                    {
                        return null;
                    }
                    else{
                    m.j++;
                    m.i=0;
                    m.k=0;
                    if(m.j>=rows[m.i].rows)
                    {
                        m.k++;
                        return null;
                    }
                    if(rows[m.i].s[m.j].seats[m.k]==null)
                    {
                        m.k++;
                        return null;
                    }
                    return rows[m.i].s[m.j].seats[m.k++];
                    }
                }
            }
        }
        
    }
    
}
