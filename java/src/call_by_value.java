//problem no. 06
//problem description:Example of call by value process

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class call_by_value_sample
{
    void change_value(int x,int y)
    {
        x=x/2;
        y=y*2;
        System.out.println("in change_value method: x="+x+" y="+y);
    }
}

public class call_by_value {
    public static void main(String[] args) throws IOException
    {
        call_by_value_sample smp=new call_by_value_sample();
        int x,y;
        String s;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a value for x:");
        s=br.readLine();
        x=Integer.parseInt(s);

        System.out.println("enter a value for y:");
        s=br.readLine();
        y=Integer.parseInt(s);
        System.out.println("before calling method:\n x="+x+" y="+y);
        smp.change_value(x,y);
        System.out.println("after calling method:");
        System.out.println("x="+x+" y="+y);
        System.out.println("no change...");
    }
}
