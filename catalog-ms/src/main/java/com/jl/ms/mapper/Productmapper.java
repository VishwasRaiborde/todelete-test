package com.jl.ms.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.jl.ms.product.vo.ProductVO;
import com.jl.ms.product.vo.json.Product;

@Component
public class Productmapper {
	
	public void copyJsonIntoVO(ProductVO vo , Product prdjsn) {
		vo.setProductId(Integer.parseInt(prdjsn.getProductId()));
		BeanUtils.copyProperties(prdjsn, vo);
		BeanUtils.copyProperties(prdjsn.getPrice(), vo.getPrice());
		BeanUtils.copyProperties(prdjsn.getColorSwatches(), vo.getColorSwatches());
	}

}
