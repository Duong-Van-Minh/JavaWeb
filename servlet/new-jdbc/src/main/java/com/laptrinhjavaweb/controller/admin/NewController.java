package com.laptrinhjavaweb.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.controller.constant.SystemConstant;
import com.laptrinhjavaweb.model.NewsModel;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.INewsService;
import com.laptrinhjavaweb.sort.Sorter;
import com.laptrinhjavaweb.utils.FormUtil;


@WebServlet(urlPatterns = {"/admin-new"})
public class NewController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Inject
	private INewsService<NewsModel, Long> newService;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NewsModel model = FormUtil.toModel(NewsModel.class, req);
		Pageble pageble  = new PageRequest(
				model.getPage(), 
				model.getMaxPageItem(), 
				new Sorter(
						model.getSortName(), 
						model.getSortBy())
				);
		
		
		model.setListResult(newService.findall(pageble));
		
		model.setTotalItem(newService.getTotalItem());
		
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
		
		req.setAttribute(SystemConstant.MODEL, model);	
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/new/list.jsp");
		
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
