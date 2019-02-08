package com.jl.rest.respository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jl.ms.configs.CatalogApplication;
import com.jl.ms.product.vo.json.Product;
import com.jl.rest.repository.CatalogClient;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CatalogApplication.class)
public class CatalogClientImplTest {
	
	@Autowired
	CatalogClient catalogClient;
	
	@Test
	public void testRestClintComms() {
		List<Product>  products = catalogClient.getProductCatalogById(600001506);
		/*for (Product product : products) {
			System.out.println(product.toString());
		}*/
		assertNotNull(products);
	}

}
