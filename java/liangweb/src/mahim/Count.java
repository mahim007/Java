package mahim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by mahim on 06-Oct-17.
 */
public class Count {
    private int cnt=0;
    private Statement statement;

    public Count(){
        initdb();
    }

    public int getCnt(){
        try {
            ResultSet resultSet=statement.executeQuery("SELECT cnt FROM count_table");
            resultSet.next();
            cnt=resultSet.getInt(1);
        }
        catch (Exception ex){
            System.err.println("Failed to Execute query!!!");
        }

        return cnt;
    }

    public void increase_cnt(){
        cnt++;
        try{
            statement.executeUpdate("UPDATE count_table SET cnt="+cnt);
        }
        catch (Exception ex){
            System.err.println("Failed to update database!!!");
        }
    }

    public  void initdb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/javabook", "root", "");
            statement=connection.createStatement();
        }
        catch (Exception ex){
            System.err.println("error caoonecting to database!!!");
        }
    }
}
