//problem no. 08
//problem description:An example of inheriting abstract class
abstract class abstract_class_student
{
    public int roll;
    public String name;
    abstract void getdata();
}

class abstract_class_result extends abstract_class_student
{
    double mark;
    void getdata()
    {
        roll=13048;
        name="Ashraful Islam";
        mark=85.85;
    }

    void display()
    {
        System.out.println("name: "+name);
        System.out.println("roll: "+roll);
        System.out.println("mark: "+mark);
    }
}
public class abstract_class {
    public static void main(String[] args)
    {
        abstract_class_result R=new abstract_class_result();
        R.getdata();
        R.display();
    }
}
