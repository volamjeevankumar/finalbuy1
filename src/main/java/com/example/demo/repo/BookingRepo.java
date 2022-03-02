package com.example.demo.repo;


import com.example.demo.entity.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepo extends MongoRepository<Booking, String> {
}
