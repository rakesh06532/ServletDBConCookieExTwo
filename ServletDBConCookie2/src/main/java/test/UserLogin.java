package test;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@SuppressWarnings("serial")
@WebServlet("/log2")
public class UserLogin extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	  throws ServletException,IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String fname=new LoginDAO().login(req);
		if(fname==null) {
			pw.println("Invalid Login Details...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		else {
			pw.println("Welcome User: "+fname+"<br>");
			Cookie ck=new Cookie("fname",fname);//Cookie Object created
			res.addCookie(ck);//Cookie Object added
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
		}
	}
	

}
