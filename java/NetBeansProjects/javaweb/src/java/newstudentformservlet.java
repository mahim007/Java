/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Personal
 */
public class newstudentformservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private PreparedStatement pstmnt;
    /**
     *
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException{
        initjdbc();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter pw=response.getWriter();
       String id=request.getParameter("id");
       String name=request.getParameter("name");
       String dept=request.getParameter("dept");
       pw.println("you entered the following data:");
       pw.println("<br> id:"+id);
       pw.println("<br> name:"+name);
       //pw.println("<br> dept:"+dept);
       
       pw.println("<p><form method=\"post\" action=\"http://localhost:8080/javaweb/newstudentformservlet\">");
       pw.println("<p><input type=\"hidden\" " +
"value=" + id + " name=\"id\">");
       pw.println("<p><input type=\"hidden\" name=\"name\" value=" +name+">");
       pw.println("<p><input type=\"hidden\" name=\"dept\" value="+dept+">");
       pw.println("<p> <input type=\"submit\" value=\"Confirm\">");
       pw.println("</form>");
       pw.close();
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        try{
            String id=request.getParameter("id");
            String name=request.getParameter("name");
            String dept=request.getParameter("dept");
            storedata(id,name,dept);
            pw.println("<br> id="+id+" name="+name+" dept="+dept+ " are now stored in database.");
        }
        catch(Exception e){
            pw.println("error:"+e.getMessage());
        }
    }

    private void initjdbc(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded.");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/javabook","root","1234");
            System.out.println("database connecetd.");
            pstmnt=con.prepareStatement("insert into student (id,name,dept) values(?,?,?)");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    private void storedata(String id,String name,String dept)throws SQLException{
        pstmnt.setString(1, id);
        pstmnt.setString(2, name);
        pstmnt.setString(3, dept);
        pstmnt.executeUpdate();
    }
}
