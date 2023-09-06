package test;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddBook extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	   throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		Cookie ck[]=req.getCookies();
		if(ck==null) {
			pw.println("Session expired...Please login again<br>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		else {
			String fname=ck[0].getValue();
			BookBean bb=new BookBean();
			bb.setBCode(req.getParameter("bcode"));
			bb.setBName(req.getParameter("bname"));
			bb.setBAuthor(req.getParameter("bauthor"));
			bb.setBPrice(Float.parseFloat(req.getParameter("bprice")));
			bb.setBQnty(Integer.parseInt(req.getParameter("bqnty")));
	    	int k=new InsertDAO().insert(bb);
		  if(k>0) {
		    pw.println("User Name: "+fname+"<br>");
		    pw.println("Book Inserted successfully...");
		    RequestDispatcher rd=req.getRequestDispatcher("AddBook.html");
		    rd.include(req, res);
		   }
		  else {
			  pw.println("Enter valid information...<br>Make sure Book Code should be unique<br>");
			  RequestDispatcher rd=req.getRequestDispatcher("AddBook.html");
			  rd.include(req, res);
		  }
		}
		}
	

}
