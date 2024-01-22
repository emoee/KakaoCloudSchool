package mycom.test.myweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/XmlServlet")
public class XmlServlet extends HttpServlet {
	// 어노테이션 없이 servlet 사용하기
	// WEB-INF/web.xml 수정 필요!
	
	private static final long serialVersionUID = 1L;
       
    public XmlServlet() {
        super();
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	super.service(req, resp);
    	// get, post 둘다 공통으로 처리하고 싶은 경우 service 사용
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML SERVLET..!");
		// request 파악
		String imgNum= request.getParameter("imgNum");
		
		// DB 로직 처리
		// response 제어
		response.setContentType("text/html; charset= utf-8");
		
		PrintWriter out= response.getWriter();
		String imgPath= "eclipse.png";
		
		if (imgNum!= null) {
			int number= Integer.parseInt(imgNum);
			switch(number) {
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
		} else {
			response.sendRedirect("error.html?img="+imgPath); 
			// 보안 상 중요. 해당 페이지의 연결을 끊고 다음 페이지를 다시 연결한다(메모리 삭제). 이전 페이지의 정보를 삭제하기 위함
		}
	}
}
