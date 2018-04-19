//problem no. 02
//problem description: object as return type

class Sample
{
    int a;
    Sample(int x)
    {
        a=x;
    }
    Sample changevalue()
    {
        Sample S=new Sample(a*2);
        return  S;
    }
}


public class objasreturntype {
    public static void main(String[] args)
    {
        Sample obj1=new Sample(20);
        Sample obj2;
        obj2=obj1.changevalue();

        System.out.println("obj1.a= "+obj1.a);
        System.out.println("obj2.a= "+obj2.a);

        obj2=obj2.changevalue();
        System.out.println("obj1.a= "+obj1.a);
        System.out.println("obj2.a= "+obj2.a);
    }
}
