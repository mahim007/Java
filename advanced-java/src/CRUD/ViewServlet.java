package CRUD;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ViewServlet")
public class ViewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<a href='index.html'>Add New Employee</a>");
        out.println("<h1>Employee List</h1>");

        List<Employee> employees = EmployeeDao.getAllEmployees();
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");

        for (Employee employee : employees) {
            out.print("<tr><td>"+employee.getId()+"</td><td>"+employee.getName()+"</td><td>"+employee.getPassword()+"</td><td>"+employee.getEmail()+"</td><td>"+employee.getCountry()+"</td><td><a href='EditServlet?id="+employee.getId()+"'>edit</a></td> <td><a href='DeleteServlet?id="+employee.getId()+"'>delete</a></td></tr>"); 
        }

        out.println("</table>");
        out.close();
    }
}
