package mvc.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;
import mvc.command.NullHandler;

// @WebServlet(loadOnStartup = 1) 로딩 타이밍이 늦기때문에 xml에 작성. (xml이 더 빠름)
public class ControllerUsingURI extends HttpServlet {
	// FrontController 모든 응답을 받아 각 응답에 맞는 서비스로 넘겨줌
	private static final long serialVersionUID = 1L;
	
	// <커맨드, 핸들러인스턴스> 매핑 정보 저장
	private Map<String, CommandHandler> commandHandlerMap= new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		String configFile= getInitParameter("configFile");
		// configFile = "/WEB-INF/commandHandlerURI.properties"
		Properties prop= new Properties();
		
		String configFilePath= getServletContext().getRealPath(configFile);
		System.out.println("===!!!===" +configFilePath);
		try (FileReader fis= new FileReader(configFilePath)) { 
			prop.load(fis);
		} catch (IOException e) {
			throw new ServletException(e);
		}
		Iterator keyIter= prop.keySet().iterator();
		while (keyIter.hasNext()) {
			String command= (String) keyIter.next();
			// command= "/join.do"
			String handlerClassName= prop.getProperty(command);
			try {
				Class<?> handlerClass= Class.forName(handlerClassName);
				CommandHandler handlerInstance= (CommandHandler) handlerClass.newInstance();
				commandHandlerMap.put(command, handlerInstance);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new ServletException(e);
			}
		}
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command= request.getRequestURI();
		if (command.indexOf(request.getContextPath()) == 0) {
			command= command.substring(request.getContextPath().length());
		}
		CommandHandler handler= commandHandlerMap.get(command);
		if (handler == null) {
			handler= new NullHandler();
		}
		String viewPage= null;
		try {
			viewPage= handler.process(request, response);
		} catch (Throwable e) {
			throw new ServletException(e);
		}
		if (viewPage != null) {
			RequestDispatcher dispatcher= request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
		
	}

}
