/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class insert_show {
    public static void main(String args[])throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("driver loaded.");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javabook","root","root")) {
            String insert="insert into student (id,name,dept) values(?,?,?)";
            //String show="select id,name,dept from student where id=?";
            //String table="select *from student";
            System.out.println("enter your choice\n 1.insert\n2.show \n3.full table");
            int n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            if(n==1){
                PreparedStatement ps=con.prepareStatement(insert);
                String next = sc.nextLine();
                System.out.println("enter your id:");
                String id=sc.nextLine();
                System.out.println("enter your name:");
                String name=sc.nextLine();
                System.out.println("enter your dept:");
                String dept=sc.nextLine();
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, dept); System.out.println(id+" "+name+" "+dept);
                ps.executeUpdate();
                System.out.println("database updated.");
            }
            else if(n==2){
                System.out.println("insert your id:");
                String id=sc.next();
                PreparedStatement ps=con.prepareStatement(show);
                ps.setString(1, id);
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
                }
            }
            else{
                PreparedStatement ps=con.prepareStatement(table);
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
                }
            }
        }
    }
}
