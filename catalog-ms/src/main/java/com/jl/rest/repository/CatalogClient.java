package com.jl.rest.repository;

import java.util.List;

import com.jl.ms.product.vo.json.Product;

public interface CatalogClient {
	
	public List<Product> getProductCatalogById(int categoryId);
	

}
