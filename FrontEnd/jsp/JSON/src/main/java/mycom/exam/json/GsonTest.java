package mycom.exam.json;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import mycom.exam.model.MemberDTO;

@WebServlet("/GsonTest")
public class GsonTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GsonTest() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// MemeberDTO(model) --> JSON
		MemberDTO m1= new MemberDTO("짱구", "010-4123-1203", "경기도");
		MemberDTO m2= new MemberDTO("짱아", "010-5624-3153", "서울");
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(m1);
		list.add(m2);
		
		Gson gson= new Gson();
		String json= gson.toJson(list);
		System.out.println(json);
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out= response.getWriter();
		out.print(json);
		
	}

}
