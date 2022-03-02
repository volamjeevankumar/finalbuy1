package com.example.demo.entity.response;

import java.util.UUID;

import com.example.demo.entity.BrandMarketChannel;
import com.example.demo.entity.Department;
import com.example.demo.entity.request.ProductRequest;


public class ProductResponse implements Comparable<ProductResponse> {
	private String description;
	
	private int units;
	private int price;
	private BrandMarketChannel brandmarketchannel;
	private Department department;
	UUID id = UUID.randomUUID();
	public int compareTo(ProductResponse p)
	{
		return this.units-p.units;
	}
	
	
	public ProductResponse(String s)
	{
		
	}

	

	public ProductResponse() {
		super();
	}

	

	public String getDescription() {
		return description;
	}

	public UUID getId() {
		return id;
	}

	public int getUnits() {
		return units;
	}

	public int getPrice() {
		return price;
	}




	public Department getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "ProductResponse [description=" + description +", units=" + units + ", price=" + price
				+ ", brandmarketchannel=" + brandmarketchannel + ", department=" + department + ", uuid=" + id + "]";
	}

	public BrandMarketChannel getBrandmarketchannel() {
		return brandmarketchannel;
	}

	public void setUnits(int units) {
		this.units = units;
	}



	public ProductResponse(ProductRequest insertdata) {
		
		this.description = insertdata.getDescription();
		this.units = insertdata.getUnits();
		this.price = insertdata.getPrice();
		this.brandmarketchannel = new BrandMarketChannel(insertdata);
		this.department = new Department(insertdata);
		
				
				

	}

}
