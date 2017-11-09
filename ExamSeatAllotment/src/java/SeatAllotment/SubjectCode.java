package SeatAllotment;

import java.util.ArrayList;

/**
 *
 * @author JERIN_JACOB
 */
public class SubjectCode {
    ArrayList a;
    String Subject;
    int front;
    int rear;
    
    public SubjectCode(){
        a= new ArrayList();
        rear=0;
        front=0;
    }
    
    public void push(Student c)
    {
        a.add(c);
        rear++;
    }
    public Student peep()
    {
        return  (Student) a.get(front);   
    }
    public Student pop()
    {
        if(front<rear)
        {
        return  (Student) a.get(front++);  
        }
        else
        {
            return null;
        }
    }
    
    public int empty()
    {
        return rear-front;
    }
}
