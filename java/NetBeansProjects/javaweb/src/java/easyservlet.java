
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class easyservlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        out.println(" i am doing little  practice here :) </B>");
        System.out.println("Servlet running just fine :D");
        out.println("<html>");
out.println("<head>");
out.println("<title>Servlet</title>");
out.println("</head>");
out.println("<body>");
out.println("Hello, Java Servlets");
out.println("</body>");
out.println("</html>");
out.close();
    }
}