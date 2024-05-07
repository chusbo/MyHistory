

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/textarea")
public class Textarea extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Textarea() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String new_id=request.getParameter("new_id");
		String new_pw1=request.getParameter("new_pw1");
		String new_pw2=request.getParameter("new_pw2");
		String user_name=request.getParameter("user_name");
		String user_mail=request.getParameter("user_mail");
		String user_tel=request.getParameter("user_tel");
			request.setAttribute("new_id", new_id);
			request.setAttribute("new_pw1", new_pw1);
			request.setAttribute("new_pw2", new_pw2);
			request.setAttribute("user_name", user_name);
			request.setAttribute("user_mail", user_mail);
			request.setAttribute("user_tel", user_tel);
		RequestDispatcher dispatch = request.getRequestDispatcher("textarea.jsp");
		dispatch.forward(request, response);
	}

}
