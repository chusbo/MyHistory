

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Number
 */
@WebServlet("/number")
public class Number extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String number1=request.getParameter("number1");
		String number2=request.getParameter("number2");
		String range=request.getParameter("range");
		request.setAttribute("number1", number1);
		request.setAttribute("number2", number2);
		request.setAttribute("range", range);
		RequestDispatcher dispatch=request.getRequestDispatcher("number.jsp?command=변경사항이 있으시면 연락부탁드립니다.");
		dispatch.forward(request,  response);
	}

}
