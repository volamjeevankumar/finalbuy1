package com.example.demo.entity;

import com.example.demo.entity.request.ProductRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BrandMarketChannel {

	String brand;
	String market;
	String channel;




	public BrandMarketChannel(ProductRequest q) {
		this.brand = q.getBrand();
		this.market = q.getMarket();
		this.channel = q.getChannel();
	}

	public BrandMarketChannel() {
		super();
	}



	
	public String getBrand() {
		return brand;
	}

	public String getMarket() {
		return market;
	}

	public String getChannel() {
		return channel;
	}

}
