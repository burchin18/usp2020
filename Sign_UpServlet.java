package users;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Sign_In")
public class Sign_UpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String username;
	String password;
	String conf_pass;
	PrintWriter writer;
	RequestDispatcher rd;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		writer = response.getWriter();
		rd = request.getRequestDispatcher("Sign_up.jsp");
		
		username = request.getParameter("user_name");
		password = request.getParameter("pw1");
		conf_pass = request.getParameter("pw2");
		
		//проверка дали всички полета са попълнени
		if(username == null || username.isEmpty()) {
			writer.println("Username is missing. \n Please fill in all fields! \n");
			rd.include(request,response);
			return;
		}
		
		if(password == null || password.isEmpty()) {
			writer.println("Password is missing. \n Please fill in all fields! \n");
			rd.include(request,response);
			return;
		}
		
		if(conf_pass == null || password.isEmpty() || conf_pass != password)  {
			writer.println("Password is missing or wrong. \n Please fill in all fields! \n");
			rd.include(request,response);
			return;
		}
		
		//проверка дали участникът е регистриран
		Sign_Up user = new Sign_Up(username, password, conf_pass);
		if(UserCollection.getInstance().contains(user)) {
			writer.append("User is already registered!");
			rd.include(request, response);
			return;
		}
		
		RequestDispatcher newRD = request.getRequestDispatcher("Log_in.jsp");
		request.setAttribute("registeredUser", user);
		newRD.forward(request, response);
		response.sendRedirect("Log_in.jsp");

	}
}
