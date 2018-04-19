//problem no. 01
//problem description:An example of java class

import java.io.*;
public class java_calss {
    public static  void main(String[] args)
    {
        int year=0;
        String s;

        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the year to be tested:");
            s=br.readLine();
            year=Integer.parseInt(s);

            if(((year%4==0)&&(year%100)!=0) ||(year%400)==0)
                System.out.println(""+year+" is a leap year.");
            else
                System.out.println(""+year+" is not a leap year.");
        }
        catch (Exception e) {}
    }
}
