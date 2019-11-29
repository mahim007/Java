package CRUD;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EditServlet")
public class EditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Update Employee</h1>");

        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = EmployeeDao.getEmployeeById(id);

        out.print("<form action='EditServlet2' method='post'>");
        out.print("<table>");
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+employee.getId()+"'/></td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+employee.getName()+"'/></td></tr>");
        out.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+employee.getPassword()+"'/></td></tr>");
        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+employee.getEmail()+"'/></td></tr>");
        out.print("<tr><td>Country:</td><td>");
        out.print("<select name='country' style='width:150px'>");
        out.print("<option>India</option>");
        out.print("<option>USA</option>");
        out.print("<option>UK</option>");
        out.print("<option>Other</option>");
        out.print("</select>");
        out.print("</td></tr>");
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");
        out.print("</table>");
        out.print("</form>");
        
        out.close();
    }
}
