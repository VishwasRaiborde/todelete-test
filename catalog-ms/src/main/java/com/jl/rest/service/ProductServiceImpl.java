package com.jl.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jl.ms.mapper.Productmapper;
import com.jl.ms.product.vo.ColorSwatchVO;
import com.jl.ms.product.vo.PriceVO;
import com.jl.ms.product.vo.ProductVO;
import com.jl.ms.product.vo.json.Product;
import com.jl.rest.repository.CatalogClient;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	CatalogClient catalogClient;

	@Autowired
	Productmapper mapper;

	public List<ProductVO> getProductForCatalogCategory(int categoryId) {
		List<Product> products = catalogClient.getProductCatalogById(categoryId);

		ProductVO productVO = new ProductVO();
		PriceVO priceVO = new PriceVO();
		List colors = new ArrayList<ColorSwatchVO>();
		ColorSwatchVO colorSwatchVO = new ColorSwatchVO();
		productVO.setPrice(priceVO);
		productVO.setColorSwatches(colors);

		List<ProductVO> productVOs = new ArrayList<ProductVO>();
		for (Product product : products) {
			mapper.copyJsonIntoVO(productVO, product);
			productVOs.add(productVO);
		}

		return productVOs;
	}

}
