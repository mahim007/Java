//problem no. 08
//problem description:A simple java program to implement interface
interface Interface_student
{
    final static int roll=13048;
    final static String name="Ashraful Islam";
    void display();
}

class Interface_result implements Interface_student
{
    public double mark;
    public void display()
    {
        System.out.println("name: "+name);
        System.out.println("roll: "+roll);
    }
    void getmark()
    {
        mark=85.85;
        System.out.println("mark: "+mark);
    }
}
public class Interface {
    public static void main(String[] args)
    {
        Interface_result R=new Interface_result();
        R.getmark();
        R.display();
    }
}
