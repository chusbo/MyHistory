

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Radio
 */
@WebServlet("/radio")
public class Radio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String subject=request.getParameter("subject");
		String[] mailings=request.getParameterValues("mailing");
		String mail="";
			for(int i=0; i< mailings.length;i++)
			{if (mailings[i]==null) continue;
			else {mail = mail + mailings[i]+"\t";}
			
			request.setAttribute("subject", subject);
			request.setAttribute("mailings", mailings);
			RequestDispatcher dispatch=request.getRequestDispatcher("/radio.jsp");
			dispatch.forward(request,  response);
			
			}
	
	}

}
