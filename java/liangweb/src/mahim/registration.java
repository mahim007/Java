package mahim;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by mahim on 05-Jul-17.
 */
@WebServlet(name = "registration")
public class registration extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        String name=request.getParameter("name");
        String id=request.getParameter("id");
        String dept=request.getParameter("dept");


        out.println("Your name is:<b>"+name+"</b><br>");
        out.println("Your ID is:<b>"+id+"</b> <br>");
        out.println("Your Dept is:<b>"+dept+"</b> <br>");

        out.close();
    }
}
