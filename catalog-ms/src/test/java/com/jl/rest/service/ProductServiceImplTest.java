package com.jl.rest.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jl.ms.configs.CatalogApplication;
import com.jl.ms.product.vo.ProductVO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CatalogApplication.class)
public class ProductServiceImplTest {

	@Autowired
	ProductService productService;

	private int categoryId = 600001506;

	@Test
	public void testGetProductForCatalogCategory() {
		List<ProductVO> productVOs = productService.getProductForCatalogCategory(categoryId);
		for (ProductVO product : productVOs) {
			System.out.println(product.toString());
		}
	}

}
