//problem no. 04
//problem description:A java program of Metohd overloading

class myclass
{
    int x,y,z;
     void getdata(int a,int b,int c)
     {
         x=a;
         y=b;
         z=c;
         System.out.println("x="+x+" y="+y+" z="+z);
     }
    void getdata(int a,int b)
    {
        x=a;
        y=b;
        z=0;
        System.out.println("x="+x+" y="+y+" z="+z);
    }
}
public class Method_overloading {
    public static void main(String[] args)
    {
        myclass s=new myclass();
        s.getdata(10,20,30);
        s.getdata(50,100);
    }
}
