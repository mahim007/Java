/**
 * Created by Ashraful Islam Mahim on 1/6/15.
 */

 class rectangle
{
    int height,width;
    rectangle(){}
    rectangle(int a,int b)
    {
        width=a;
        height=b;
    }
    public rectangle getrectangleobject()
    {
        rectangle obj=new rectangle();
        obj.height=this.height;
        obj.width=this.width;
        return obj;
    }
}
public class return_object {
    public static void main(String[] args)
    {
        rectangle obj1=new rectangle(40,50);
        rectangle obj2;
        obj2=obj1.getrectangleobject();

        System.out.println("Width:"+obj2.width);
        System.out.println("Height:"+obj2.height);
    }
}
