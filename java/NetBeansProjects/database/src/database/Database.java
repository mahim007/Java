/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Personal
 */
public class Database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLDataException,ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("driver loaded.");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/javabook","root","1234");
        System.out.println("database conected.");
        String sql="select id,name,dept from student where dept=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, "ict");
        ResultSet rs;
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }
        con.close();
    }
}
