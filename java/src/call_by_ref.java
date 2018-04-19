//problem no. 07
//problem description:Example of call by reference

class call_by_ref_sample
{
    int a,b;
    call_by_ref_sample(int x,int y)
    {
        a=x;
        b=y;
    }
    void change_value(call_by_ref_sample smpl)
    {
        smpl.a=smpl.a/2;
        smpl.b=smpl.b*2;
    }
}
public class call_by_ref {
    public static void main(String[] args)
    {
        call_by_ref_sample obj=new call_by_ref_sample(10,20);
        System.out.println("before calling method:");
        System.out.println("a="+obj.a+" b="+obj.b);

        obj.change_value(obj);
        System.out.println("after calling method:");
        System.out.println("a=" + obj.a + " b=" + obj.b);
        System.out.println("change......");
    }
}
