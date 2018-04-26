package com.seongchan.service;

import com.seongchan.dao.ProductDAO;

public class ProductService {

	ProductDAO dao;
	
	public ProductService() {
	
	}
	
	public void setProductDao(ProductDAO dao) {
		this.dao = dao;
	}


	@Override
	public String toString() {
		return dao.toString();
	}
}
