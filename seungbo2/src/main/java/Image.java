

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Image
 */
@WebServlet("/image")
public class Image extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Image() {
        super();}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			request.setAttribute("user_id", id);
			request.setAttribute("time", pw);
		RequestDispatcher dispatch = request.getRequestDispatcher("/image.jsp");
		dispatch.forward(request, response);
	
	}

}
