import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        String name = request.getParameter("userName");
        String pass = request.getParameter("userPass");

        if (pass.equals("servlet")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome");
            requestDispatcher.forward(request, response);
        } else {
            printWriter.print("Username or Password error!");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
            requestDispatcher.include(request, response);
        }
    }
}
