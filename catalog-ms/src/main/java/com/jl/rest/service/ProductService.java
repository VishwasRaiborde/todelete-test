package com.jl.rest.service;

import java.util.List;

import com.jl.ms.product.vo.ProductVO;

public interface ProductService {
	
	public List<ProductVO> getProductForCatalogCategory(int categoryID);

}
