package mycom.test.myweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyServlet() {
        super();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.doPost(req, resp);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet...!");
		// request 파악
		String imgNum= request.getParameter("imgNum");
		
		// DB 로직 처리
		// response 제어
		response.setContentType("text/html; charset= utf-8");
		
		PrintWriter out= response.getWriter();
		String imgPath= "eclipse.png";
		
		switch(Integer.parseInt(imgNum)) {
			case 1:
				imgPath= "HTML.png";
				break;
			case 2:
				imgPath= "CSS.png";
				break;
			case 3:
				imgPath= "JS.png";
				break;
			default:
				imgPath= "eclipse.png";
		}
		
		out.write("<h1>Welcome to Servlet</h1>");
		out.write("<img  width=\"150\" src=\"image/"+imgPath+"\">");
		
		out.close();
	}
}
