package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request,response);
	}

	private void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		//Building a prininting the HTml Response Code
		PrintWriter out=response.getWriter();
		out.write("<html><body><div id='servletResponse' style='text-align:center'>");
		out.write("<h2>Java Servlet Filter Example</h2>");
		out.write("<p style='color:green;font-size:large'>Welcome Administration</p>");
		out.write("</div></body></html>");
	}

	
	
}
