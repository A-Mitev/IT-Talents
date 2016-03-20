package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/home")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
   
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String user = request.getParameter("user");
		
		if(user.equals("Nexus")){
			response.sendRedirect("./Welcome.html");
		} else {
			response.sendRedirect("./InvalidLogin.html");;
		}
	}

}
