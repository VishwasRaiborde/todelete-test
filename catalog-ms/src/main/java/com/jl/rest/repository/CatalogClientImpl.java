package com.jl.rest.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.jl.ms.product.vo.json.Product;
import com.jl.ms.product.vo.json.ProductCatalogue;

@Repository
public class CatalogClientImpl implements CatalogClient {

	@Autowired
	RestTemplate restTemplate;
	
	//https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma

	private static final String URL = "https://jl-nonprod-syst.apigee.net/v1/categories/";
	private static final String URL_VALUE = "/products?";
	private static final String URL_KEY = "key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma";
	

	public List<Product> getProductCatalogById(int categoryId) {
		StringBuilder builder = new StringBuilder();
	    builder.append(URL) ;
	    builder.append(categoryId);
	    builder.append(URL_VALUE);
	    builder.append(URL_KEY); 
		

	    List<Product> products = restTemplate.getForObject(builder.toString(), ProductCatalogue.class).getProducts();

		return products;
	}

}
