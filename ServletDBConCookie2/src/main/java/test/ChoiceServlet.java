package test;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
@SuppressWarnings("serial")
@WebServlet("/choice")
public class ChoiceServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	  throws ServletException,IOException {
		String s1=req.getParameter("s1");
		if(s1.equals("AdminLogin")) {
			RequestDispatcher rd=req.getRequestDispatcher("log1");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("log2");
			rd.forward(req, res);
		}
	}

}
