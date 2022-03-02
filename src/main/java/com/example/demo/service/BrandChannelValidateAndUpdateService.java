package com.example.demo.service;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.request.ProductRequest;
import com.example.demo.entity.response.ProductResponse;
import com.example.demo.exceptionfamily.BrandChannelException;
import com.example.demo.repo.Productrepo;

@Service
public class BrandChannelValidateAndUpdateService {
	@Autowired
	private Productrepo productrepo;
	@Autowired
	private BrandValidationService brandValidationService;
	@Autowired
	private ChannelValidationService channelVaidationServiceObject;

	public String brandChannelValidateAndUpdateService(ProductRequest productRequest)
			throws Exception {

		List<String> errors = new ArrayList<>();
		boolean isValidBrand = brandValidationService.validateBrand(productRequest.getBrand());
		boolean isValidChannel = channelVaidationServiceObject.validateChannel(productRequest.getChannel());
		if (isValidBrand && isValidChannel) {
			ProductResponse p = new ProductResponse(productRequest);
			productrepo.save(p);
			
			
		}

		else if (isValidBrand == isValidChannel) {
			errors.add("invalid brand");
			errors.add("invalid channel");
			throw new BrandChannelException(errors);
		} else if (isValidBrand) {
			errors.add("invalid channel");
			throw new BrandChannelException(errors);

		} else if (isValidChannel) {
			errors.add("invalid brand");
			throw new BrandChannelException(errors);

		}	return "product created";

	}


}
