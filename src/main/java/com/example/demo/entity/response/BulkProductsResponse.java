package com.example.demo.entity.response;
import java.util.List;

public class BulkProductsResponse {
	private List<ProductResponse> products;

	public List<ProductResponse> getProducts() {
		return products;
	}

	public void setProducts(List<ProductResponse> products) {
		this.products = products;
	}

}
