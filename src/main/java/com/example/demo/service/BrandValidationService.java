package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BrandValidationService {
	@Autowired
	private RestTemplate resttemplate;

	@Value("${brandservice.hostname}")
	private String brandServiceHostname;

	public boolean validateBrand(String brand) throws Exception {
		String brandLowerCase = brand.toLowerCase();


		List<String> brandNames=new ArrayList<String>();
		brandNames.add("gap");
		brandNames.add("kaira");
		brandNames.add("levis");
		return brandNames.contains(brandLowerCase);
//		URI uri=new URI(brandServiceHostname+"/brandsList");
//		try {
//		ResponseEntity<List<String>> brandNames =
//		        resttemplate.exchange(uri,HttpMethod.GET,null,new ParameterizedTypeReference<List<String>>() {});
//		if (brandNames.getBody().contains(brandLowerCase))
//			return true;
//		else
//			return false;
//	}
//		catch(Exception e ) {
//			throw new BrandServiceException("brand service   changed code for new branch server not accessible");
//
//		}
//		finally {}

}
}
