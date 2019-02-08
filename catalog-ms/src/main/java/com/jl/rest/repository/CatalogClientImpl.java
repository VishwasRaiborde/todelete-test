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

	private static final String URL = "https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma";

	public List<Product> getProductCatalogById(int categoryId) {

		List<Product> products = restTemplate.getForObject(URL, ProductCatalogue.class).getProducts();

		return products;
	}

}
