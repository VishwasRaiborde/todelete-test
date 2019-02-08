package com.jl.ms.product.vo;

import java.io.Serializable;

public class NowPriceRangeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double from;
	private Double to;

	public Double getFrom() {
		return from;
	}

	public void setFrom(Double from) {
		this.from = from;
	}

	public Double getTo() {
		return to;
	}

	public void setTo(Double to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "NowPriceRangeVO [from=" + from + ", to=" + to + "]";
	}
	


}
