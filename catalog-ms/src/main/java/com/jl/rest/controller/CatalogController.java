package com.jl.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jl.ms.product.vo.ProductVO;
import com.jl.rest.service.ProductService;

@RestController
@RequestMapping("/api/v1/")
public class CatalogController {

	@Autowired
	ProductService productService;

	@GetMapping(value = "/products/{categoryid}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<ProductVO>> getProducts(@PathVariable("categoryid") Integer categoryid) {
		List<ProductVO> productVOs = productService.getProductForCatalogCategory(categoryid);
		return new ResponseEntity(productVOs, HttpStatus.OK);
	}
}
