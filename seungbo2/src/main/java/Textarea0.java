

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Textarea0
 */
@WebServlet("/textarea3")
public class Textarea0 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Textarea0() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id=request.getParameter("user_id");
		String user_pw=request.getParameter("user_pw");
			request.setAttribute("user_id", user_id);
			request.setAttribute("user_pw", user_pw);
		RequestDispatcher dispatch = request.getRequestDispatcher("textarea3.jsp");
		dispatch.forward(request, response);
	
	
	}

}
