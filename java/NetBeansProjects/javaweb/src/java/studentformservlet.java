

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class studentformservlet
 */
@WebServlet("/studentformservlet")
public class studentformservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PreparedStatement pstmnt;
    public studentformservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		initjdbc();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("e");
		String dept=request.getParameter("p");
		pw.print(name);
		pw.println(" "+dept);
		try{
			storedata(name,dept);
			pw.println("name:"+name+" and dept:"+dept+" are stored in the database");
			
		}
		catch (Exception e){
			pw.println("error :( "+e.getMessage());
		}
		finally{
			pw.close();
		} 
	}
	
	private void initjdbc(){
		System.out.println("now in init");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/javabook","root","1234");
			System.out.println("Database connected.");
			pstmnt=con.prepareStatement("insert into student (name,dept) values(?,?)");
		}
		catch (Exception e){
			System.err.println("driver not found :(");
		}
	}
	private void storedata(String name,String dept) throws SQLException{
		pstmnt.setString(1, name);
		pstmnt.setString(2, dept);
		System.out.println("query updating.");
		pstmnt.executeUpdate();
	}
}
