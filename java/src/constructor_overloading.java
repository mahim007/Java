//problem no. 05
//problem description:A java program of constructor overloading


class constructor_overloading_student
{
    int roll;
    String name;
    float mark;

    constructor_overloading_student()
    {
        roll=318;
        name="masud rana";
        mark=70.35f;
    }

    constructor_overloading_student(int r,String s,float f)
    {
        roll=r;
        name=s;
        mark=f;
    }

    constructor_overloading_student(constructor_overloading_student std)
    {
        roll=std.roll;
        name=std.name;
        mark=std.mark;
    }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("mark: "+mark);
    }
}


public class constructor_overloading {
    public static void main(String[] args)
    {
        constructor_overloading_student s1=new constructor_overloading_student();
        System.out.println("record of s1:");
        s1.display();

        System.out.println();
        constructor_overloading_student s2=new constructor_overloading_student(13048,"Ashraful Islam",80.85f);
        System.out.println("record of s2:");
        s2.display();
        System.out.println();

        constructor_overloading_student s3=new constructor_overloading_student(s2);
        System.out.println("record of s3:");
        s3.display();
        System.out.println();

        System.out.println("new record of s3");
        s3=s1;
        s3.display();
        System.out.println();
    }
}
