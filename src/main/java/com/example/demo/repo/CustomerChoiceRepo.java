package com.example.demo.repo;


import com.example.demo.entity.CustomerChoice;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerChoiceRepo extends MongoRepository<CustomerChoice, String> {

    @Query(value = "{" +
            "   accid :?0," +
            "   'startBookingPeriod.season' : ?1," +
            "   'startBookingPeriod.year' : ?2,"+
            "}"
    )
    CustomerChoice findCustomerChoicebyCombination(String accid, String season, Integer year);

}