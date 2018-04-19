package mahim;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by mahim on 05-Jul-17.
 */
@WebServlet(name = "jdbcregistration")
public class jdbcregistration extends HttpServlet {

    private PreparedStatement statement;

    public void init() throws ServletException{
        initjdbc();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        String name=request.getParameter("name");
        String id=request.getParameter("id");
        String dept=request.getParameter("dept");

        try {
            if(name.length()==0 || id.length()==0 || dept.length()==0){
                System.out.println("field can not be empty!!!");
            }
            else {
                store(name,id,dept);
                out.println("<p><h3>Database Updated... </br>");
            }
        }
        catch (Exception ex){
            out.println("<p>ERROR!");
        }

        out.close();
    }


    private void initjdbc(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/javabook","root","");
            System.out.println("database connected");

            statement=connection.prepareStatement("INSERT INTO student (Name ,ID ,Dept) VALUES (?,?,?)");
        }
        catch (Exception ex){
            System.err.println(ex);
        }
    }

    private void store(String name,String id, String dept) throws SQLException {
            statement.setString(1,name);
            statement.setString(2,id);
            statement.setString(3,dept);

            statement.executeUpdate();
    }
}
