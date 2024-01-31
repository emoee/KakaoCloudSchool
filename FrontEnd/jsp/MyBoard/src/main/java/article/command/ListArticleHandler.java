package article.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.service.ListArticleService;
import mvc.command.CommandHandler;
import article.service.ArticlePage;

public class ListArticleHandler implements CommandHandler {

	private ListArticleService listService = new ListArticleService();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// request 요청 파악 parameter
		// service --> DAO: model
		// response (model, view); = model and view
		
		String pageNoVal= req.getParameter("pageNo");
		int pageNo= 1;
		if (pageNoVal != null) {
			pageNo= Integer.parseInt(pageNoVal); // String이 클래스 타입이므로 Interger로 변환
		}
		ArticlePage articlePage= listService.getArticlePage(pageNo);
		req.setAttribute("articlePage", articlePage);
		return "/WEB-INF/view/listarticle.jsp";
	}

}
