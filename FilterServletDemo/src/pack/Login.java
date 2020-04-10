package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login implements Filter {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		RequestDispatcher rdObj=null;
		PrintWriter out=response.getWriter();
		out.write("<html><body><div id='servletResponse' style='text-align:center'>");
		String password=request.getParameter("password");
		System.out.println("Password :"+password);
		if(password!=null && password.equals("admin")) {
			chain.doFilter(request,response);
		}
		else {
			out.print("<p id='errMsg' style='color:red;font-size:large'>Sorry Wrong Password</p>");
			rdObj=request.getRequestDispatcher("/index.jsp");
			rdObj.include(request, response);
		}
		out.write("</div></body></html>");
	}
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}


	


	

}
