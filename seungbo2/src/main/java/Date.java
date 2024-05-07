

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/date")
public class Date extends HttpServlet {
	private static final long serialVersionUID = 1L;
      public Date() {
        super();}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String start=request.getParameter("start");
		String end=request.getParameter("end");
			System.out.println(start);
			System.out.println(end);
				request.setAttribute("start", start);
				request.setAttribute("end", end);
		RequestDispatcher dispatch=request.getRequestDispatcher("/date.jsp");
		dispatch.forward(request, response);

	}

}
