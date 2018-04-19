//problem no. 03
//problem description:An example of java Inheritance

class student
{
    protected int roll;
    protected String name=new String();
}

class result extends student
{
    double mark;
    void getdata()
    {
        roll=13048;
        name="Ashraful Islam";
        mark=80.50;
    }
}
public class inheritance {
    public static void main(String[] args)
    {
        result r=new result();
        r.getdata();

        System.out.println("name:"+r.name);
        System.out.println("roll:"+r.roll);
        System.out.println("mark:"+r.mark);
    }
}
