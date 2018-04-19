//problem no. 08
//problem description:An example of method overriding
class method_overriding_student
{
    public int roll;
    public String name;
   // abstract void getdata();
    void display()
    {
        System.out.println("name is:"+name);
    }
}

class method_overriding_result extends method_overriding_student
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
        super.display();
        System.out.println("roll: "+roll);
        System.out.println("mark: "+mark);
    }
}
 class method_overriding {
    public static void main(String[] args)
    {
        method_overriding_result R=new method_overriding_result();
        R.getdata();
        R.display();
    }
}
