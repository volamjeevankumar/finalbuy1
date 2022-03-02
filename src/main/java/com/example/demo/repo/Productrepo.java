package com.example.demo.repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.response.ProductResponse;

@Repository
public interface Productrepo extends MongoRepository<ProductResponse,UUID> {

	@Query(value= "{'description':?0}")
	List<ProductResponse> findByBrandmarketchannelBrand(String brand);



}
