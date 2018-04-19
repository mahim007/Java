//problem no. 09
//problem description:A simple arraylist program

import java.util.ArrayList;

public class aray_list {
    public static void main(String[] args)
    {
        ArrayList<String>x=new ArrayList<String>();
        x.add("A");
        x.add("B");
        x.add(2,"C");
        x.add("D");
        x.add("E");
        System.out.println("size of the list is:"+x.size());
        for(int i=0;i<x.size();i++)
        {
            System.out.println("i="+i+" data:"+x.get(i));
        }
        System.out.println("index of C is:"+x.indexOf("C"));
        x.set(4,"X");
        System.out.println("i="+4+" data:"+x.get(4));
        System.out.println("now removing 3rd element");
        x.remove(3);
        for(int i=0;i<x.size();i++)
        {
            System.out.println("i="+i+" data:"+x.get(i));
        }
        System.out.println("now removing X");
        x.remove("X");
        for(int i=0;i<x.size();i++)
        {
            System.out.println("i="+i+" data:"+x.get(i));
        }
        System.out.println("now removing all data");
        x.clear();

        if(x.isEmpty())
            System.out.println("all datas are deleted.");

    }
}
