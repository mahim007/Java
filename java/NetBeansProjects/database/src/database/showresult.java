/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Personal
 */
public class showresult {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("driver loaded");
        try (Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javabook","root","1234")) {
            System.out.println("database connected");
            String sql="select *from student where dept not in(?)";
            PreparedStatement ps=(PreparedStatement) connection.prepareStatement(sql);
            ps.setString(1, "ict");
            ResultSet rs=(ResultSet) ps.executeQuery();
            while(rs.next()){
                System.out.println(""+rs.getString(1) + "\t"+ rs.getString(2)+"\t"+rs.getString(3));
                System.out.println("");
            }
        }
    }
}
