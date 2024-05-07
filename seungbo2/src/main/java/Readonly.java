

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Readonly
 */
@WebServlet("/readonly")
public class Readonly extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Readonly() {
        super();     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id=request.getParameter("user_id");
		String time=request.getParameter("time");
		String uid=request.getParameter("uid");
		String uclass=request.getParameter("uclass");
		String book=request.getParameter("book");
		String wsheet=request.getParameter("wsheet");
		String group=request.getParameter("group");
		request.setAttribute("user_id", user_id);
		request.setAttribute("time", time);
		request.setAttribute("uid", uid);
		request.setAttribute("uclass", uclass);
		request.setAttribute("book", book);
		request.setAttribute("wsheet", wsheet);
		request.setAttribute("group", group);
		RequestDispatcher dispatch=request.getRequestDispatcher("/image.jsp");
		dispatch.forward(request, response);

	}

}
