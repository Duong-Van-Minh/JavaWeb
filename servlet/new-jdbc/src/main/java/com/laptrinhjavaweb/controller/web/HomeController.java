package com.laptrinhjavaweb.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.model.NewsModel;
import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.service.INewsService;

@WebServlet(urlPatterns = {"/trang-chu","/dang-nhap"})
public class HomeController extends HttpServlet{
	@Inject
	private ICategoryService<CategoryModel, Long> categotyService;
	
	@Inject
	private INewsService<NewsModel, Long> newService;
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Long id = 1l;
		
		//req.setAttribute("newService", newService.findByCategoryId(id));
		
//		String title = "bai viet";
//		String content = "ok man";
//		Long category_id = 1l;
//		NewsModel newsModel = new NewsModel();
//		newsModel.setCategory_id(category_id);
//		newsModel.setTitle(title);
//		newsModel.setContent(content);
//		newService.Insert(newsModel);
		String action = req.getParameter("action");
		if(action != null && action.equals("login")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
			rd.forward(req, resp);
		}else if(action != null && action.equals("logout")) {
			
		}else {
			req.setAttribute("categories", categotyService.FindAll());
			
			RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
			rd.forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
