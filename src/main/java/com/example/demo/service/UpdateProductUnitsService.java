package com.example.demo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.request.UnitsUpdateRequest;
import com.example.demo.entity.response.ProductResponse;
import com.example.demo.exceptionfamily.ProductNotFoundException;
import com.example.demo.repo.Productrepo;
@Service
public class UpdateProductUnitsService {
	@Autowired
	private Productrepo productrepo;
	public ProductResponse UpdateProductUnits(String id,UnitsUpdateRequest unitsObject) throws ProductNotFoundException
	{
		
		ProductResponse productResponseObject = productrepo.findById(UUID.fromString(id))
	.orElseThrow(() -> new ProductNotFoundException("product not found really"));

		
		productResponseObject.setUnits(unitsObject.getUnits());
		productrepo.save(productResponseObject);
		return productResponseObject;
		
	}
	
	
	
}
