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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet...!");
		// request 파악
		// DB 로직 처리
		// response 제어
		response.setContentType("text/html; charset= utf-8");
		
		PrintWriter out= response.getWriter();
		out.write("<h1>Welcome to Servlet</h1>");
		String imgPath= "eclipse.png";
		out.write("<img src=\"image/"+imgPath+"\">");
		
		out.close();
	}
}
