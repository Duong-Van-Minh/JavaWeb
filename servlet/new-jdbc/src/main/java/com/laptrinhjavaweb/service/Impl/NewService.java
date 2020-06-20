package com.laptrinhjavaweb.service.Impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.INewsDao;
import com.laptrinhjavaweb.model.NewsModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.INewsService;

public class NewService implements  INewsService<NewsModel, Long>{
	
	@Inject
	private INewsDao newsDao;
	
	@Override
	public List<NewsModel> findByCategoryId(Long id) {
		return newsDao.findByCategoryId(id);
	}

	@Override
	public NewsModel Insert(NewsModel entity) {
		entity.setCreateddate(new Timestamp(System.currentTimeMillis()));
		entity.setCreatedby("");//ai la nguoi viet bai do
		Long newId = newsDao.Insert(entity);
		
		return newsDao.findOne(newId);
	}

	@Override
	public NewsModel update(NewsModel entity) {
		NewsModel oldNews = newsDao.findOne(entity.getId());
		entity.setCreateddate(oldNews.getCreateddate());
		entity.setCreatedby(oldNews.getCreatedby());
		entity.setModifieddate(new Timestamp(System.currentTimeMillis()));
		entity.setModifiedby("");
		newsDao.update(entity);
		
		return newsDao.findOne(entity.getId());
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id: ids) {
			newsDao.delete(id);
		}
	}

	

	@Override
	public int getTotalItem() {
		return newsDao.getTotalItem();
	}

	@Override
	public List<NewsModel> findall(Pageble pageble) {
		
		return newsDao.FindAll(pageble);
	}

	

}
